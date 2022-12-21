package com.proto.prime;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Calculate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculateServiceGrpc {

  private CalculateServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.prime.CalculateRequest,
      com.proto.prime.CalculateResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Calculate",
      requestType = com.proto.prime.CalculateRequest.class,
      responseType = com.proto.prime.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.CalculateRequest,
      com.proto.prime.CalculateResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.CalculateRequest, com.proto.prime.CalculateResponse> getCalculateMethod;
    if ((getCalculateMethod = CalculateServiceGrpc.getCalculateMethod) == null) {
      synchronized (CalculateServiceGrpc.class) {
        if ((getCalculateMethod = CalculateServiceGrpc.getCalculateMethod) == null) {
          CalculateServiceGrpc.getCalculateMethod = getCalculateMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.CalculateRequest, com.proto.prime.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.CalculateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculateServiceMethodDescriptorSupplier("Calculate"))
              .build();
        }
      }
    }
    return getCalculateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateServiceStub>() {
        @java.lang.Override
        public CalculateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateServiceStub(channel, callOptions);
        }
      };
    return CalculateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateServiceBlockingStub>() {
        @java.lang.Override
        public CalculateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateServiceFutureStub>() {
        @java.lang.Override
        public CalculateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateServiceFutureStub(channel, callOptions);
        }
      };
    return CalculateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(com.proto.prime.CalculateRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.CalculateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.CalculateRequest,
                com.proto.prime.CalculateResponse>(
                  this, METHODID_CALCULATE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculateServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculateServiceStub> {
    private CalculateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(com.proto.prime.CalculateRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.CalculateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculateServiceBlockingStub> {
    private CalculateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.prime.CalculateResponse calculate(com.proto.prime.CalculateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculateServiceFutureStub> {
    private CalculateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.CalculateResponse> calculate(
        com.proto.prime.CalculateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((com.proto.prime.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.CalculateResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.prime.Calculate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculateService");
    }
  }

  private static final class CalculateServiceFileDescriptorSupplier
      extends CalculateServiceBaseDescriptorSupplier {
    CalculateServiceFileDescriptorSupplier() {}
  }

  private static final class CalculateServiceMethodDescriptorSupplier
      extends CalculateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculateServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
