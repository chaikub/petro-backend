package com.proto.prime;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: route.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RouteServiceGrpc {

  private RouteServiceGrpc() {}

  public static final String SERVICE_NAME = "RouteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.prime.AddRouteToFavoriteRequest,
      com.proto.prime.AddRouteToFavoriteResponse> getAddRouteToFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRouteToFavorite",
      requestType = com.proto.prime.AddRouteToFavoriteRequest.class,
      responseType = com.proto.prime.AddRouteToFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.AddRouteToFavoriteRequest,
      com.proto.prime.AddRouteToFavoriteResponse> getAddRouteToFavoriteMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.AddRouteToFavoriteRequest, com.proto.prime.AddRouteToFavoriteResponse> getAddRouteToFavoriteMethod;
    if ((getAddRouteToFavoriteMethod = RouteServiceGrpc.getAddRouteToFavoriteMethod) == null) {
      synchronized (RouteServiceGrpc.class) {
        if ((getAddRouteToFavoriteMethod = RouteServiceGrpc.getAddRouteToFavoriteMethod) == null) {
          RouteServiceGrpc.getAddRouteToFavoriteMethod = getAddRouteToFavoriteMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.AddRouteToFavoriteRequest, com.proto.prime.AddRouteToFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRouteToFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddRouteToFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddRouteToFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteServiceMethodDescriptorSupplier("AddRouteToFavorite"))
              .build();
        }
      }
    }
    return getAddRouteToFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.prime.RemoveRouteFromFavoriteRequest,
      com.proto.prime.RemoveRouteFromFavoriteResponse> getRemoveAddRouteToFavoriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAddRouteToFavorite",
      requestType = com.proto.prime.RemoveRouteFromFavoriteRequest.class,
      responseType = com.proto.prime.RemoveRouteFromFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.RemoveRouteFromFavoriteRequest,
      com.proto.prime.RemoveRouteFromFavoriteResponse> getRemoveAddRouteToFavoriteMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.RemoveRouteFromFavoriteRequest, com.proto.prime.RemoveRouteFromFavoriteResponse> getRemoveAddRouteToFavoriteMethod;
    if ((getRemoveAddRouteToFavoriteMethod = RouteServiceGrpc.getRemoveAddRouteToFavoriteMethod) == null) {
      synchronized (RouteServiceGrpc.class) {
        if ((getRemoveAddRouteToFavoriteMethod = RouteServiceGrpc.getRemoveAddRouteToFavoriteMethod) == null) {
          RouteServiceGrpc.getRemoveAddRouteToFavoriteMethod = getRemoveAddRouteToFavoriteMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.RemoveRouteFromFavoriteRequest, com.proto.prime.RemoveRouteFromFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAddRouteToFavorite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemoveRouteFromFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemoveRouteFromFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteServiceMethodDescriptorSupplier("RemoveAddRouteToFavorite"))
              .build();
        }
      }
    }
    return getRemoveAddRouteToFavoriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.prime.QueryFavRoutesResquest,
      com.proto.prime.QueryFavRoutesResponse> getQueryFavRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFavRoute",
      requestType = com.proto.prime.QueryFavRoutesResquest.class,
      responseType = com.proto.prime.QueryFavRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.QueryFavRoutesResquest,
      com.proto.prime.QueryFavRoutesResponse> getQueryFavRouteMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.QueryFavRoutesResquest, com.proto.prime.QueryFavRoutesResponse> getQueryFavRouteMethod;
    if ((getQueryFavRouteMethod = RouteServiceGrpc.getQueryFavRouteMethod) == null) {
      synchronized (RouteServiceGrpc.class) {
        if ((getQueryFavRouteMethod = RouteServiceGrpc.getQueryFavRouteMethod) == null) {
          RouteServiceGrpc.getQueryFavRouteMethod = getQueryFavRouteMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.QueryFavRoutesResquest, com.proto.prime.QueryFavRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFavRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.QueryFavRoutesResquest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.QueryFavRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteServiceMethodDescriptorSupplier("QueryFavRoute"))
              .build();
        }
      }
    }
    return getQueryFavRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteServiceStub>() {
        @java.lang.Override
        public RouteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteServiceStub(channel, callOptions);
        }
      };
    return RouteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteServiceBlockingStub>() {
        @java.lang.Override
        public RouteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteServiceBlockingStub(channel, callOptions);
        }
      };
    return RouteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteServiceFutureStub>() {
        @java.lang.Override
        public RouteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteServiceFutureStub(channel, callOptions);
        }
      };
    return RouteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RouteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addRouteToFavorite(com.proto.prime.AddRouteToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddRouteToFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRouteToFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void removeAddRouteToFavorite(com.proto.prime.RemoveRouteFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemoveRouteFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAddRouteToFavoriteMethod(), responseObserver);
    }

    /**
     */
    public void queryFavRoute(com.proto.prime.QueryFavRoutesResquest request,
        io.grpc.stub.StreamObserver<com.proto.prime.QueryFavRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFavRouteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRouteToFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.AddRouteToFavoriteRequest,
                com.proto.prime.AddRouteToFavoriteResponse>(
                  this, METHODID_ADD_ROUTE_TO_FAVORITE)))
          .addMethod(
            getRemoveAddRouteToFavoriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.RemoveRouteFromFavoriteRequest,
                com.proto.prime.RemoveRouteFromFavoriteResponse>(
                  this, METHODID_REMOVE_ADD_ROUTE_TO_FAVORITE)))
          .addMethod(
            getQueryFavRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.QueryFavRoutesResquest,
                com.proto.prime.QueryFavRoutesResponse>(
                  this, METHODID_QUERY_FAV_ROUTE)))
          .build();
    }
  }

  /**
   */
  public static final class RouteServiceStub extends io.grpc.stub.AbstractAsyncStub<RouteServiceStub> {
    private RouteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteServiceStub(channel, callOptions);
    }

    /**
     */
    public void addRouteToFavorite(com.proto.prime.AddRouteToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddRouteToFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRouteToFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeAddRouteToFavorite(com.proto.prime.RemoveRouteFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemoveRouteFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAddRouteToFavoriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFavRoute(com.proto.prime.QueryFavRoutesResquest request,
        io.grpc.stub.StreamObserver<com.proto.prime.QueryFavRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFavRouteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RouteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteServiceBlockingStub> {
    private RouteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.prime.AddRouteToFavoriteResponse addRouteToFavorite(com.proto.prime.AddRouteToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRouteToFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.prime.RemoveRouteFromFavoriteResponse removeAddRouteToFavorite(com.proto.prime.RemoveRouteFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAddRouteToFavoriteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.prime.QueryFavRoutesResponse queryFavRoute(com.proto.prime.QueryFavRoutesResquest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFavRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RouteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RouteServiceFutureStub> {
    private RouteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.AddRouteToFavoriteResponse> addRouteToFavorite(
        com.proto.prime.AddRouteToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRouteToFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.RemoveRouteFromFavoriteResponse> removeAddRouteToFavorite(
        com.proto.prime.RemoveRouteFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAddRouteToFavoriteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.QueryFavRoutesResponse> queryFavRoute(
        com.proto.prime.QueryFavRoutesResquest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFavRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ROUTE_TO_FAVORITE = 0;
  private static final int METHODID_REMOVE_ADD_ROUTE_TO_FAVORITE = 1;
  private static final int METHODID_QUERY_FAV_ROUTE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ROUTE_TO_FAVORITE:
          serviceImpl.addRouteToFavorite((com.proto.prime.AddRouteToFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.AddRouteToFavoriteResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ADD_ROUTE_TO_FAVORITE:
          serviceImpl.removeAddRouteToFavorite((com.proto.prime.RemoveRouteFromFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.RemoveRouteFromFavoriteResponse>) responseObserver);
          break;
        case METHODID_QUERY_FAV_ROUTE:
          serviceImpl.queryFavRoute((com.proto.prime.QueryFavRoutesResquest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.QueryFavRoutesResponse>) responseObserver);
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

  private static abstract class RouteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.prime.RouteOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteService");
    }
  }

  private static final class RouteServiceFileDescriptorSupplier
      extends RouteServiceBaseDescriptorSupplier {
    RouteServiceFileDescriptorSupplier() {}
  }

  private static final class RouteServiceMethodDescriptorSupplier
      extends RouteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteServiceFileDescriptorSupplier())
              .addMethod(getAddRouteToFavoriteMethod())
              .addMethod(getRemoveAddRouteToFavoriteMethod())
              .addMethod(getQueryFavRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
