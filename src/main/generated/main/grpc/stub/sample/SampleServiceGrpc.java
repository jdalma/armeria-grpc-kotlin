package stub.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: sample/SampleProto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.sample.SampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleUnaryCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleUnaryCall",
      requestType = stub.sample.SampleRequest.class,
      responseType = stub.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleUnaryCallMethod() {
    io.grpc.MethodDescriptor<stub.sample.SampleRequest, stub.sample.SampleResponse> getSampleUnaryCallMethod;
    if ((getSampleUnaryCallMethod = SampleServiceGrpc.getSampleUnaryCallMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getSampleUnaryCallMethod = SampleServiceGrpc.getSampleUnaryCallMethod) == null) {
          SampleServiceGrpc.getSampleUnaryCallMethod = getSampleUnaryCallMethod =
              io.grpc.MethodDescriptor.<stub.sample.SampleRequest, stub.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleUnaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("SampleUnaryCall"))
              .build();
        }
      }
    }
    return getSampleUnaryCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleCallClientStream",
      requestType = stub.sample.SampleRequest.class,
      responseType = stub.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallClientStreamMethod() {
    io.grpc.MethodDescriptor<stub.sample.SampleRequest, stub.sample.SampleResponse> getSampleCallClientStreamMethod;
    if ((getSampleCallClientStreamMethod = SampleServiceGrpc.getSampleCallClientStreamMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getSampleCallClientStreamMethod = SampleServiceGrpc.getSampleCallClientStreamMethod) == null) {
          SampleServiceGrpc.getSampleCallClientStreamMethod = getSampleCallClientStreamMethod =
              io.grpc.MethodDescriptor.<stub.sample.SampleRequest, stub.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleCallClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("SampleCallClientStream"))
              .build();
        }
      }
    }
    return getSampleCallClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleCallServerStream",
      requestType = stub.sample.SampleRequest.class,
      responseType = stub.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallServerStreamMethod() {
    io.grpc.MethodDescriptor<stub.sample.SampleRequest, stub.sample.SampleResponse> getSampleCallServerStreamMethod;
    if ((getSampleCallServerStreamMethod = SampleServiceGrpc.getSampleCallServerStreamMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getSampleCallServerStreamMethod = SampleServiceGrpc.getSampleCallServerStreamMethod) == null) {
          SampleServiceGrpc.getSampleCallServerStreamMethod = getSampleCallServerStreamMethod =
              io.grpc.MethodDescriptor.<stub.sample.SampleRequest, stub.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleCallServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("SampleCallServerStream"))
              .build();
        }
      }
    }
    return getSampleCallServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallBiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleCallBiStream",
      requestType = stub.sample.SampleRequest.class,
      responseType = stub.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<stub.sample.SampleRequest,
      stub.sample.SampleResponse> getSampleCallBiStreamMethod() {
    io.grpc.MethodDescriptor<stub.sample.SampleRequest, stub.sample.SampleResponse> getSampleCallBiStreamMethod;
    if ((getSampleCallBiStreamMethod = SampleServiceGrpc.getSampleCallBiStreamMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getSampleCallBiStreamMethod = SampleServiceGrpc.getSampleCallBiStreamMethod) == null) {
          SampleServiceGrpc.getSampleCallBiStreamMethod = getSampleCallBiStreamMethod =
              io.grpc.MethodDescriptor.<stub.sample.SampleRequest, stub.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleCallBiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("SampleCallBiStream"))
              .build();
        }
      }
    }
    return getSampleCallBiStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub>() {
        @java.lang.Override
        public SampleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceStub(channel, callOptions);
        }
      };
    return SampleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub>() {
        @java.lang.Override
        public SampleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceBlockingStub(channel, callOptions);
        }
      };
    return SampleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub>() {
        @java.lang.Override
        public SampleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceFutureStub(channel, callOptions);
        }
      };
    return SampleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sampleUnaryCall(stub.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSampleUnaryCallMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.sample.SampleRequest> sampleCallClientStream(
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSampleCallClientStreamMethod(), responseObserver);
    }

    /**
     */
    public void sampleCallServerStream(stub.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSampleCallServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.sample.SampleRequest> sampleCallBiStream(
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSampleCallBiStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSampleUnaryCallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                stub.sample.SampleRequest,
                stub.sample.SampleResponse>(
                  this, METHODID_SAMPLE_UNARY_CALL)))
          .addMethod(
            getSampleCallClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                stub.sample.SampleRequest,
                stub.sample.SampleResponse>(
                  this, METHODID_SAMPLE_CALL_CLIENT_STREAM)))
          .addMethod(
            getSampleCallServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                stub.sample.SampleRequest,
                stub.sample.SampleResponse>(
                  this, METHODID_SAMPLE_CALL_SERVER_STREAM)))
          .addMethod(
            getSampleCallBiStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                stub.sample.SampleRequest,
                stub.sample.SampleResponse>(
                  this, METHODID_SAMPLE_CALL_BI_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class SampleServiceStub extends io.grpc.stub.AbstractAsyncStub<SampleServiceStub> {
    private SampleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void sampleUnaryCall(stub.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSampleUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.sample.SampleRequest> sampleCallClientStream(
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSampleCallClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sampleCallServerStream(stub.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSampleCallServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.sample.SampleRequest> sampleCallBiStream(
        io.grpc.stub.StreamObserver<stub.sample.SampleResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSampleCallBiStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SampleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public stub.sample.SampleResponse sampleUnaryCall(stub.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSampleUnaryCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<stub.sample.SampleResponse> sampleCallServerStream(
        stub.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSampleCallServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stub.sample.SampleResponse> sampleUnaryCall(
        stub.sample.SampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSampleUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAMPLE_UNARY_CALL = 0;
  private static final int METHODID_SAMPLE_CALL_SERVER_STREAM = 1;
  private static final int METHODID_SAMPLE_CALL_CLIENT_STREAM = 2;
  private static final int METHODID_SAMPLE_CALL_BI_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAMPLE_UNARY_CALL:
          serviceImpl.sampleUnaryCall((stub.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<stub.sample.SampleResponse>) responseObserver);
          break;
        case METHODID_SAMPLE_CALL_SERVER_STREAM:
          serviceImpl.sampleCallServerStream((stub.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<stub.sample.SampleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAMPLE_CALL_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sampleCallClientStream(
              (io.grpc.stub.StreamObserver<stub.sample.SampleResponse>) responseObserver);
        case METHODID_SAMPLE_CALL_BI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sampleCallBiStream(
              (io.grpc.stub.StreamObserver<stub.sample.SampleResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stub.sample.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(getSampleUnaryCallMethod())
              .addMethod(getSampleCallClientStreamMethod())
              .addMethod(getSampleCallServerStreamMethod())
              .addMethod(getSampleCallBiStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
