package com.proto.prime;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Oil.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OilServiceGrpc {

  private OilServiceGrpc() {}

  public static final String SERVICE_NAME = "OilService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.prime.AddOilToFavoriteRequest,
      com.proto.prime.AddOilToFavoriteResponse> getAddOilToFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOilToFavorite",
      requestType = com.proto.prime.AddOilToFavoriteRequest.class,
      responseType = com.proto.prime.AddOilToFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.AddOilToFavoriteRequest,
      com.proto.prime.AddOilToFavoriteResponse> getAddOilToFavoriteMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.AddOilToFavoriteRequest, com.proto.prime.AddOilToFavoriteResponse> getAddOilToFavoriteMethod;
    if ((getAddOilToFavoriteMethod = OilServiceGrpc.getAddOilToFavoriteMethod) == null) {
      synchronized (OilServiceGrpc.class) {
        if ((getAddOilToFavoriteMethod = OilServiceGrpc.getAddOilToFavoriteMethod) == null) {
          OilServiceGrpc.getAddOilToFavoriteMethod = getAddOilToFavoriteMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.AddOilToFavoriteRequest, com.proto.prime.AddOilToFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOilToFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddOilToFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddOilToFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OilServiceMethodDescriptorSupplier("AddOilToFavorite"))
              .build();
        }
      }
    }
    return getAddOilToFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.prime.RemoveOilFromFavoriteRequest,
      com.proto.prime.RemoveOilFromFavoriteResponse> getRemoveFavOilMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFavOil",
      requestType = com.proto.prime.RemoveOilFromFavoriteRequest.class,
      responseType = com.proto.prime.RemoveOilFromFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.RemoveOilFromFavoriteRequest,
      com.proto.prime.RemoveOilFromFavoriteResponse> getRemoveFavOilMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.RemoveOilFromFavoriteRequest, com.proto.prime.RemoveOilFromFavoriteResponse> getRemoveFavOilMethod;
    if ((getRemoveFavOilMethod = OilServiceGrpc.getRemoveFavOilMethod) == null) {
      synchronized (OilServiceGrpc.class) {
        if ((getRemoveFavOilMethod = OilServiceGrpc.getRemoveFavOilMethod) == null) {
          OilServiceGrpc.getRemoveFavOilMethod = getRemoveFavOilMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.RemoveOilFromFavoriteRequest, com.proto.prime.RemoveOilFromFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFavOil"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemoveOilFromFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemoveOilFromFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OilServiceMethodDescriptorSupplier("RemoveFavOil"))
              .build();
        }
      }
    }
    return getRemoveFavOilMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.prime.QueryFavOilRequest,
      com.proto.prime.QueryFavOilResponse> getQueryFavOilMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFavOil",
      requestType = com.proto.prime.QueryFavOilRequest.class,
      responseType = com.proto.prime.QueryFavOilResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.QueryFavOilRequest,
      com.proto.prime.QueryFavOilResponse> getQueryFavOilMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.QueryFavOilRequest, com.proto.prime.QueryFavOilResponse> getQueryFavOilMethod;
    if ((getQueryFavOilMethod = OilServiceGrpc.getQueryFavOilMethod) == null) {
      synchronized (OilServiceGrpc.class) {
        if ((getQueryFavOilMethod = OilServiceGrpc.getQueryFavOilMethod) == null) {
          OilServiceGrpc.getQueryFavOilMethod = getQueryFavOilMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.QueryFavOilRequest, com.proto.prime.QueryFavOilResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFavOil"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.QueryFavOilRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.QueryFavOilResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OilServiceMethodDescriptorSupplier("QueryFavOil"))
              .build();
        }
      }
    }
    return getQueryFavOilMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OilServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OilServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OilServiceStub>() {
        @java.lang.Override
        public OilServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OilServiceStub(channel, callOptions);
        }
      };
    return OilServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OilServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OilServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OilServiceBlockingStub>() {
        @java.lang.Override
        public OilServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OilServiceBlockingStub(channel, callOptions);
        }
      };
    return OilServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OilServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OilServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OilServiceFutureStub>() {
        @java.lang.Override
        public OilServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OilServiceFutureStub(channel, callOptions);
        }
      };
    return OilServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OilServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addOilToFavorite(com.proto.prime.AddOilToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddOilToFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOilToFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void removeFavOil(com.proto.prime.RemoveOilFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemoveOilFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFavOilMethod(), responseObserver);
    }

    /**
     */
    public void queryFavOil(com.proto.prime.QueryFavOilRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.QueryFavOilResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFavOilMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddOilToFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.AddOilToFavoriteRequest,
                com.proto.prime.AddOilToFavoriteResponse>(
                  this, METHODID_ADD_OIL_TO_FAVORITE)))
          .addMethod(
            getRemoveFavOilMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.RemoveOilFromFavoriteRequest,
                com.proto.prime.RemoveOilFromFavoriteResponse>(
                  this, METHODID_REMOVE_FAV_OIL)))
          .addMethod(
            getQueryFavOilMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.QueryFavOilRequest,
                com.proto.prime.QueryFavOilResponse>(
                  this, METHODID_QUERY_FAV_OIL)))
          .build();
    }
  }

  /**
   */
  public static final class OilServiceStub extends io.grpc.stub.AbstractAsyncStub<OilServiceStub> {
    private OilServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OilServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OilServiceStub(channel, callOptions);
    }

    /**
     */
    public void addOilToFavorite(com.proto.prime.AddOilToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddOilToFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOilToFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFavOil(com.proto.prime.RemoveOilFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemoveOilFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFavOilMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFavOil(com.proto.prime.QueryFavOilRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.QueryFavOilResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFavOilMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OilServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OilServiceBlockingStub> {
    private OilServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OilServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OilServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.prime.AddOilToFavoriteResponse addOilToFavorite(com.proto.prime.AddOilToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOilToFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.prime.RemoveOilFromFavoriteResponse removeFavOil(com.proto.prime.RemoveOilFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFavOilMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.prime.QueryFavOilResponse queryFavOil(com.proto.prime.QueryFavOilRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFavOilMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OilServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OilServiceFutureStub> {
    private OilServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OilServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OilServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.AddOilToFavoriteResponse> addOilToFavorite(
        com.proto.prime.AddOilToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOilToFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.RemoveOilFromFavoriteResponse> removeFavOil(
        com.proto.prime.RemoveOilFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFavOilMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.QueryFavOilResponse> queryFavOil(
        com.proto.prime.QueryFavOilRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFavOilMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_OIL_TO_FAVORITE = 0;
  private static final int METHODID_REMOVE_FAV_OIL = 1;
  private static final int METHODID_QUERY_FAV_OIL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OilServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OilServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_OIL_TO_FAVORITE:
          serviceImpl.addOilToFavorite((com.proto.prime.AddOilToFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.AddOilToFavoriteResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FAV_OIL:
          serviceImpl.removeFavOil((com.proto.prime.RemoveOilFromFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.RemoveOilFromFavoriteResponse>) responseObserver);
          break;
        case METHODID_QUERY_FAV_OIL:
          serviceImpl.queryFavOil((com.proto.prime.QueryFavOilRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.QueryFavOilResponse>) responseObserver);
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

  private static abstract class OilServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OilServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.prime.Oil.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OilService");
    }
  }

  private static final class OilServiceFileDescriptorSupplier
      extends OilServiceBaseDescriptorSupplier {
    OilServiceFileDescriptorSupplier() {}
  }

  private static final class OilServiceMethodDescriptorSupplier
      extends OilServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OilServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OilServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OilServiceFileDescriptorSupplier())
              .addMethod(getAddOilToFavoriteMethod())
              .addMethod(getRemoveFavOilMethod())
              .addMethod(getQueryFavOilMethod())
              .build();
        }
      }
    }
    return result;
  }
}
