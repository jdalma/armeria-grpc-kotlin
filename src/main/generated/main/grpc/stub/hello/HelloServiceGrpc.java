package stub.hello;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: sample/HelloProto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloUnaryCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloUnaryCall",
      requestType = stub.hello.HelloRequest.class,
      responseType = stub.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloUnaryCallMethod() {
    io.grpc.MethodDescriptor<stub.hello.HelloRequest, stub.hello.HelloResponse> getHelloUnaryCallMethod;
    if ((getHelloUnaryCallMethod = HelloServiceGrpc.getHelloUnaryCallMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloUnaryCallMethod = HelloServiceGrpc.getHelloUnaryCallMethod) == null) {
          HelloServiceGrpc.getHelloUnaryCallMethod = getHelloUnaryCallMethod =
              io.grpc.MethodDescriptor.<stub.hello.HelloRequest, stub.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloUnaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloUnaryCall"))
              .build();
        }
      }
    }
    return getHelloUnaryCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloCallClientStream",
      requestType = stub.hello.HelloRequest.class,
      responseType = stub.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallClientStreamMethod() {
    io.grpc.MethodDescriptor<stub.hello.HelloRequest, stub.hello.HelloResponse> getHelloCallClientStreamMethod;
    if ((getHelloCallClientStreamMethod = HelloServiceGrpc.getHelloCallClientStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloCallClientStreamMethod = HelloServiceGrpc.getHelloCallClientStreamMethod) == null) {
          HelloServiceGrpc.getHelloCallClientStreamMethod = getHelloCallClientStreamMethod =
              io.grpc.MethodDescriptor.<stub.hello.HelloRequest, stub.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloCallClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloCallClientStream"))
              .build();
        }
      }
    }
    return getHelloCallClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloCallServerStream",
      requestType = stub.hello.HelloRequest.class,
      responseType = stub.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallServerStreamMethod() {
    io.grpc.MethodDescriptor<stub.hello.HelloRequest, stub.hello.HelloResponse> getHelloCallServerStreamMethod;
    if ((getHelloCallServerStreamMethod = HelloServiceGrpc.getHelloCallServerStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloCallServerStreamMethod = HelloServiceGrpc.getHelloCallServerStreamMethod) == null) {
          HelloServiceGrpc.getHelloCallServerStreamMethod = getHelloCallServerStreamMethod =
              io.grpc.MethodDescriptor.<stub.hello.HelloRequest, stub.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloCallServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloCallServerStream"))
              .build();
        }
      }
    }
    return getHelloCallServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallBiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloCallBiStream",
      requestType = stub.hello.HelloRequest.class,
      responseType = stub.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<stub.hello.HelloRequest,
      stub.hello.HelloResponse> getHelloCallBiStreamMethod() {
    io.grpc.MethodDescriptor<stub.hello.HelloRequest, stub.hello.HelloResponse> getHelloCallBiStreamMethod;
    if ((getHelloCallBiStreamMethod = HelloServiceGrpc.getHelloCallBiStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloCallBiStreamMethod = HelloServiceGrpc.getHelloCallBiStreamMethod) == null) {
          HelloServiceGrpc.getHelloCallBiStreamMethod = getHelloCallBiStreamMethod =
              io.grpc.MethodDescriptor.<stub.hello.HelloRequest, stub.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloCallBiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stub.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloCallBiStream"))
              .build();
        }
      }
    }
    return getHelloCallBiStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void helloUnaryCall(stub.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloUnaryCallMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.hello.HelloRequest> helloCallClientStream(
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHelloCallClientStreamMethod(), responseObserver);
    }

    /**
     */
    public void helloCallServerStream(stub.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloCallServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.hello.HelloRequest> helloCallBiStream(
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHelloCallBiStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloUnaryCallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                stub.hello.HelloRequest,
                stub.hello.HelloResponse>(
                  this, METHODID_HELLO_UNARY_CALL)))
          .addMethod(
            getHelloCallClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                stub.hello.HelloRequest,
                stub.hello.HelloResponse>(
                  this, METHODID_HELLO_CALL_CLIENT_STREAM)))
          .addMethod(
            getHelloCallServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                stub.hello.HelloRequest,
                stub.hello.HelloResponse>(
                  this, METHODID_HELLO_CALL_SERVER_STREAM)))
          .addMethod(
            getHelloCallBiStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                stub.hello.HelloRequest,
                stub.hello.HelloResponse>(
                  this, METHODID_HELLO_CALL_BI_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void helloUnaryCall(stub.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.hello.HelloRequest> helloCallClientStream(
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHelloCallClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void helloCallServerStream(stub.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHelloCallServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<stub.hello.HelloRequest> helloCallBiStream(
        io.grpc.stub.StreamObserver<stub.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHelloCallBiStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public stub.hello.HelloResponse helloUnaryCall(stub.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloUnaryCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<stub.hello.HelloResponse> helloCallServerStream(
        stub.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHelloCallServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stub.hello.HelloResponse> helloUnaryCall(
        stub.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_UNARY_CALL = 0;
  private static final int METHODID_HELLO_CALL_SERVER_STREAM = 1;
  private static final int METHODID_HELLO_CALL_CLIENT_STREAM = 2;
  private static final int METHODID_HELLO_CALL_BI_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_UNARY_CALL:
          serviceImpl.helloUnaryCall((stub.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<stub.hello.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_CALL_SERVER_STREAM:
          serviceImpl.helloCallServerStream((stub.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<stub.hello.HelloResponse>) responseObserver);
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
        case METHODID_HELLO_CALL_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloCallClientStream(
              (io.grpc.stub.StreamObserver<stub.hello.HelloResponse>) responseObserver);
        case METHODID_HELLO_CALL_BI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloCallBiStream(
              (io.grpc.stub.StreamObserver<stub.hello.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stub.hello.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloUnaryCallMethod())
              .addMethod(getHelloCallClientStreamMethod())
              .addMethod(getHelloCallServerStreamMethod())
              .addMethod(getHelloCallBiStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
