package com.example.armeriaserver.grpc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.awaitility.Awaitility.await;
import static stub.sample.SampleServiceGrpc.*;

import com.example.armeriaserver.grpc.sample.SampleServiceImpl;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.linecorp.armeria.client.grpc.GrpcClients;
import com.linecorp.armeria.common.grpc.GrpcSerializationFormats;
import com.linecorp.armeria.internal.common.grpc.GrpcStatus;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.AccessLogWriter;
import com.linecorp.armeria.server.logging.ContentPreviewingService;
import com.linecorp.armeria.server.logging.LoggingService;
import com.linecorp.armeria.testing.junit5.server.ServerExtension;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import stub.sample.Detail;
import stub.sample.SampleRequest;
import stub.sample.SampleResponse;
import stub.sample.SampleServiceGrpc;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

@DisplayName("Sample Proto 테스트")
class SampleServiceTest {

    @RegisterExtension
    static final ServerExtension server = new ServerExtension() {
        @Override
        protected void configure(ServerBuilder sb) {
            GrpcService grpcService = GrpcService.builder()
                    .addService(new SampleServiceImpl())
                    .build();

            sb.accessLogWriter(AccessLogWriter.combined(), false);
            sb.decorator(LoggingService.newDecorator());
            sb.decorator(ContentPreviewingService.newDecorator(500, StandardCharsets.UTF_8));

            // stub 구현체 등록
            sb.service(grpcService);
        }
    };

    @Nested
    @DisplayName("SampleUnaryCall - 단항 통신")
    class Describe_SampleUnaryCall{

        @Test
        @DisplayName("기본(Async) Stub")
        void async() {
            final String message = "[async stub call]";
            final SampleServiceStub asyncStub = getSampleAsyncClient();
            final SampleRequest request = getSampleRequest(message);
            final AtomicBoolean completed = new AtomicBoolean();
            final StreamObserver<SampleResponse> streamObserver = new StreamObserver<>() {
                @Override
                public void onNext(SampleResponse value) {
                    equalsTest(value, message);
                }

                @Override
                public void onError(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }

                @Override
                public void onCompleted() {
                    completed.set(true);
                }
            };

            asyncStub.sampleUnaryCall(request, streamObserver);

            await().untilTrue(completed);
        }

        @Test
        @DisplayName("Blocking Stub")
        void blocking() {
            final String message = "[blocking stub call]";
            final SampleRequest request = getSampleRequest(message);
            final SampleServiceBlockingStub blockingStub = getSampleBlockingClient();
            SampleResponse response = blockingStub.sampleUnaryCall(request);

            equalsTest(response, message);
        }

        @Test
        @DisplayName("Future Stub")
        void future() throws ExecutionException, InterruptedException {
            final String message = "[future stub call]";
            final SampleRequest request = getSampleRequest(message);
            final SampleServiceFutureStub futureStub = getSampleFutureClient();
            final ListenableFuture<SampleResponse> future = futureStub.sampleUnaryCall(request);

            System.out.println(Thread.currentThread() + " addCallback before");
            Futures.addCallback(future, new FutureCallback<>() {
                @Override
                public void onSuccess(SampleResponse result) {
                    System.out.println(Thread.currentThread() + " addCallback onSuccess");
                }

                @Override
                public void onFailure(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }
            }, MoreExecutors.directExecutor());

            SampleResponse response = future.get();
            equalsTest(response, message);
//            await().untilTrue(completed);
        }

        @Test
        @DisplayName("Future Stub - multiple calls")
        void multi_future() throws ExecutionException, InterruptedException {
            final String message = "[multi future stub call]";
            final SampleRequest firstRequest = getSampleRequest("sleep");
            final SampleRequest sleepRequest = getSampleRequest(message);
            final SampleServiceFutureStub futureStub = getSampleFutureClient();
            final ListenableFuture<SampleResponse> firstFuture = futureStub.sampleUnaryCall(firstRequest);
            final ListenableFuture<SampleResponse> secondFuture = futureStub.sampleUnaryCall(sleepRequest);

            Futures.addCallback(firstFuture, new FutureCallback<>() {
                @Override
                public void onSuccess(SampleResponse result) {
                    System.out.println(Thread.currentThread() + " firstFuture [onSuccess]");
                }

                @Override
                public void onFailure(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }
            }, MoreExecutors.directExecutor());

            Futures.addCallback(secondFuture, new FutureCallback<>() {
                @Override
                public void onSuccess(SampleResponse result) {
                    System.out.println(Thread.currentThread() + " secondFuture [onSuccess]");
                }

                @Override
                public void onFailure(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }
            }, MoreExecutors.directExecutor());

            SampleResponse firstResponse = firstFuture.get();
            equalsTest(firstResponse, "sleep");

            SampleResponse secondResponse = secondFuture.get();
            equalsTest(secondResponse, message);
        }
    }

    @Nested
    @DisplayName("SampleCallClientStream")
    class Describe_SampleCallClientStream{

        @Test
        @DisplayName("기본(Async) Stub")
        void async() {
            final String alphabets = "ABCDE";
            final SampleServiceStub asyncStub = getSampleAsyncClient();
            final AtomicBoolean completed = new AtomicBoolean();
            StreamObserver<SampleResponse> response = new StreamObserver<>() {
                private boolean received;

                @Override
                public void onNext(SampleResponse value) {
                    assertThat(received).isFalse();
                    assertThat(value.getMessage()).contains(alphabets);
                    received = true;
                }

                @Override
                public void onError(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }

                @Override
                public void onCompleted() {
                    assertThat(received).isTrue();
                    completed.set(true);
                }
            };
            final StreamObserver<SampleRequest> request = asyncStub.sampleCallClientStream(response);
            // 해당 request의 onNext(), onCompleted()는 채널에 연결된 StreamObserver<SampleRequest> 메소드를 호춣한다.
            for (char e : alphabets.toCharArray()) {
                request.onNext(SampleRequest.newBuilder().setString(String.valueOf(e)).build());
            }
            request.onCompleted();

            await().untilTrue(completed);
        }

        @Test
        @DisplayName("Blocking Stub (not support)")
        void blocking() {
        }

        @Test
        @DisplayName("Future Stub (not support)")
        void future() {
        }
    }

    @Nested
    @DisplayName("SampleCallServerStream")
    class Describe_SampleCallServerStream {

        @Test
        @DisplayName("기본(Async) Stub")
        void async() {
            final List<String> messages = List.of("first", "second", "third", "fourth");
            final Queue<String> queue = new ArrayDeque<>();
            final String message = "[async stub call]";
            final SampleServiceStub asyncStub = getSampleAsyncClient();
            final SampleRequest request = getSampleRequest(message);
            final AtomicBoolean completed = new AtomicBoolean();
            final StreamObserver<SampleResponse> streamObserver = new StreamObserver<>() {
                @Override
                public void onNext(SampleResponse value) {
                    queue.offer(value.getMessage());
                }

                @Override
                public void onError(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }

                @Override
                public void onCompleted() {
                    completed.set(true);
                }
            };
            asyncStub.sampleCallServerStream(request, streamObserver);
            int index = 0;
            while(!queue.isEmpty()) {
                String result = queue.poll();
                assertThat(messages.get(index++)).isEqualTo(result);
            }
            await().untilTrue(completed);
        }

        @Test
        @DisplayName("Blocking Stub")
        void blocking() {
            final List<String> messages = List.of("first", "second", "third", "fourth");
            final String message = "[blocking stub call]";
            final SampleServiceBlockingStub blockingStub = getSampleBlockingClient();
            final SampleRequest request = getSampleRequest(message);

            Iterator<SampleResponse> sampleResponseIterator = blockingStub.sampleCallServerStream(request);

            int index = 0;
            while (sampleResponseIterator.hasNext()) {
                SampleResponse response = sampleResponseIterator.next();
                assertThat(messages.get(index++)).isEqualTo(response.getMessage());
            }
        }

        @Test
        @DisplayName("Future Stub (not support)")
        void future() {
        }
    }

    @Nested
    @DisplayName("SampleCallBiStream")
    class Describe_SampleCallBiStream {
        private AtomicBoolean completed;
        private final List<String> messages = List.of("first", "second", "third", "fourth");
        private StreamObserver<SampleResponse> getResponseStreamObserver() {
            return new StreamObserver<>() {
                int index = 0;
                @Override
                public void onNext(SampleResponse value) {
                    System.out.println("SampleResponse " + index);
                    String responseMessage = value.getMessage();
                    assertThat(responseMessage.contains(messages.get(index++))).isTrue();
                }
                @Override
                public void onError(Throwable t) {
                    fail(GrpcStatus.fromThrowable(t).toString());
                }

                @Override
                public void onCompleted() {
                    completed.set(true);
                }
            };
        }

        @BeforeEach
        void setUp() {
            completed = new AtomicBoolean();
        }

        @Test
        @DisplayName("기본(Async) Stub")
        void async() {
            final SampleServiceStub asyncStub = getSampleAsyncClient();
            final StreamObserver<SampleResponse> streamObserver = getResponseStreamObserver();
            final StreamObserver<SampleRequest> request = asyncStub.sampleCallBiStream(streamObserver);
            for (String message : messages) {
                request.onNext(SampleRequest.newBuilder().setString(message).build());
            }
            request.onCompleted();

            await().untilTrue(completed);
        }

        @Test
        @DisplayName("Blocking Stub (not support)")
        void blocking() {
        }

        @Test
        @DisplayName("Future Stub (not support)")
        void future() {
        }
    }

    private void equalsTest(SampleResponse response, String message) {
        assertThat(response.getMessage()).startsWith(message);

        Detail detail = response.getDetail();
        assertThat(detail.getData()).isEqualTo("response detail data");
        assertThat(detail.getNumbersCount()).isEqualTo(2);
    }
    private SampleServiceStub getSampleAsyncClient() {
        return GrpcClients.builder(uri()).build(SampleServiceStub.class);
    }

    private SampleServiceBlockingStub getSampleBlockingClient() {
        return GrpcClients.builder(uri()).build(SampleServiceBlockingStub.class);
    }

    private SampleServiceFutureStub getSampleFutureClient() {
        return GrpcClients.builder(uri()).build(SampleServiceFutureStub.class);
    }

    private SampleRequest getSampleRequest(String message) {
        return SampleRequest.newBuilder()
                .setString(message)
                .setNumber(1)
                .setNegative(-1)
                .build();
    }

    private String uri() {
        return server.httpUri(GrpcSerializationFormats.PROTO).toString();
    }
}
