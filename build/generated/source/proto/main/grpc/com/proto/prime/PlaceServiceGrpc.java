package com.proto.prime;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: Place.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlaceServiceGrpc {

  private PlaceServiceGrpc() {}

  public static final String SERVICE_NAME = "PlaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.prime.AddPlaceToFavoriteRequest,
      com.proto.prime.AddPlaceToFavoriteResponse> getAddPlaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPlace",
      requestType = com.proto.prime.AddPlaceToFavoriteRequest.class,
      responseType = com.proto.prime.AddPlaceToFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.AddPlaceToFavoriteRequest,
      com.proto.prime.AddPlaceToFavoriteResponse> getAddPlaceMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.AddPlaceToFavoriteRequest, com.proto.prime.AddPlaceToFavoriteResponse> getAddPlaceMethod;
    if ((getAddPlaceMethod = PlaceServiceGrpc.getAddPlaceMethod) == null) {
      synchronized (PlaceServiceGrpc.class) {
        if ((getAddPlaceMethod = PlaceServiceGrpc.getAddPlaceMethod) == null) {
          PlaceServiceGrpc.getAddPlaceMethod = getAddPlaceMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.AddPlaceToFavoriteRequest, com.proto.prime.AddPlaceToFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPlace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddPlaceToFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.AddPlaceToFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaceServiceMethodDescriptorSupplier("AddPlace"))
              .build();
        }
      }
    }
    return getAddPlaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.prime.RemovePlaceFromFavoriteRequest,
      com.proto.prime.RemovePlaceFromFavoriteResponse> getRemovePlaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePlace",
      requestType = com.proto.prime.RemovePlaceFromFavoriteRequest.class,
      responseType = com.proto.prime.RemovePlaceFromFavoriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.prime.RemovePlaceFromFavoriteRequest,
      com.proto.prime.RemovePlaceFromFavoriteResponse> getRemovePlaceMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.RemovePlaceFromFavoriteRequest, com.proto.prime.RemovePlaceFromFavoriteResponse> getRemovePlaceMethod;
    if ((getRemovePlaceMethod = PlaceServiceGrpc.getRemovePlaceMethod) == null) {
      synchronized (PlaceServiceGrpc.class) {
        if ((getRemovePlaceMethod = PlaceServiceGrpc.getRemovePlaceMethod) == null) {
          PlaceServiceGrpc.getRemovePlaceMethod = getRemovePlaceMethod =
              io.grpc.MethodDescriptor.<com.proto.prime.RemovePlaceFromFavoriteRequest, com.proto.prime.RemovePlaceFromFavoriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePlace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemovePlaceFromFavoriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.RemovePlaceFromFavoriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaceServiceMethodDescriptorSupplier("RemovePlace"))
              .build();
        }
      }
    }
    return getRemovePlaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaceServiceStub>() {
        @java.lang.Override
        public PlaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaceServiceStub(channel, callOptions);
        }
      };
    return PlaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaceServiceBlockingStub>() {
        @java.lang.Override
        public PlaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaceServiceBlockingStub(channel, callOptions);
        }
      };
    return PlaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaceServiceFutureStub>() {
        @java.lang.Override
        public PlaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaceServiceFutureStub(channel, callOptions);
        }
      };
    return PlaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PlaceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addPlace(com.proto.prime.AddPlaceToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddPlaceToFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPlaceMethod(), responseObserver);
    }

    /**
     */
    public void removePlace(com.proto.prime.RemovePlaceFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemovePlaceFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePlaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPlaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.AddPlaceToFavoriteRequest,
                com.proto.prime.AddPlaceToFavoriteResponse>(
                  this, METHODID_ADD_PLACE)))
          .addMethod(
            getRemovePlaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.prime.RemovePlaceFromFavoriteRequest,
                com.proto.prime.RemovePlaceFromFavoriteResponse>(
                  this, METHODID_REMOVE_PLACE)))
          .build();
    }
  }

  /**
   */
  public static final class PlaceServiceStub extends io.grpc.stub.AbstractAsyncStub<PlaceServiceStub> {
    private PlaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaceServiceStub(channel, callOptions);
    }

    /**
     */
    public void addPlace(com.proto.prime.AddPlaceToFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.AddPlaceToFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPlaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePlace(com.proto.prime.RemovePlaceFromFavoriteRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.RemovePlaceFromFavoriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePlaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PlaceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlaceServiceBlockingStub> {
    private PlaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.prime.AddPlaceToFavoriteResponse addPlace(com.proto.prime.AddPlaceToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPlaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.prime.RemovePlaceFromFavoriteResponse removePlace(com.proto.prime.RemovePlaceFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePlaceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlaceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PlaceServiceFutureStub> {
    private PlaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.AddPlaceToFavoriteResponse> addPlace(
        com.proto.prime.AddPlaceToFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPlaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.prime.RemovePlaceFromFavoriteResponse> removePlace(
        com.proto.prime.RemovePlaceFromFavoriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePlaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PLACE = 0;
  private static final int METHODID_REMOVE_PLACE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlaceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlaceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PLACE:
          serviceImpl.addPlace((com.proto.prime.AddPlaceToFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.AddPlaceToFavoriteResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PLACE:
          serviceImpl.removePlace((com.proto.prime.RemovePlaceFromFavoriteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.RemovePlaceFromFavoriteResponse>) responseObserver);
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

  private static abstract class PlaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.prime.Place.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlaceService");
    }
  }

  private static final class PlaceServiceFileDescriptorSupplier
      extends PlaceServiceBaseDescriptorSupplier {
    PlaceServiceFileDescriptorSupplier() {}
  }

  private static final class PlaceServiceMethodDescriptorSupplier
      extends PlaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlaceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlaceServiceFileDescriptorSupplier())
              .addMethod(getAddPlaceMethod())
              .addMethod(getRemovePlaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
