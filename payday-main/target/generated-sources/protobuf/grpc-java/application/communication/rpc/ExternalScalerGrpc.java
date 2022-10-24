package application.communication.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: external_scaler.proto")
public final class ExternalScalerGrpc {

  private ExternalScalerGrpc() {}

  public static final String SERVICE_NAME = "application.communication.rpc.ExternalScaler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
      application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> getIsActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsActive",
      requestType = application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef.class,
      responseType = application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
      application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> getIsActiveMethod() {
    io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef, application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> getIsActiveMethod;
    if ((getIsActiveMethod = ExternalScalerGrpc.getIsActiveMethod) == null) {
      synchronized (ExternalScalerGrpc.class) {
        if ((getIsActiveMethod = ExternalScalerGrpc.getIsActiveMethod) == null) {
          ExternalScalerGrpc.getIsActiveMethod = getIsActiveMethod =
              io.grpc.MethodDescriptor.<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef, application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExternalScalerMethodDescriptorSupplier("IsActive"))
              .build();
        }
      }
    }
    return getIsActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
      application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> getGetMetricSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetricSpec",
      requestType = application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef.class,
      responseType = application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
      application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> getGetMetricSpecMethod() {
    io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef, application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> getGetMetricSpecMethod;
    if ((getGetMetricSpecMethod = ExternalScalerGrpc.getGetMetricSpecMethod) == null) {
      synchronized (ExternalScalerGrpc.class) {
        if ((getGetMetricSpecMethod = ExternalScalerGrpc.getGetMetricSpecMethod) == null) {
          ExternalScalerGrpc.getGetMetricSpecMethod = getGetMetricSpecMethod =
              io.grpc.MethodDescriptor.<application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef, application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetricSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExternalScalerMethodDescriptorSupplier("GetMetricSpec"))
              .build();
        }
      }
    }
    return getGetMetricSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest,
      application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> getGetMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetrics",
      requestType = application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest.class,
      responseType = application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest,
      application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> getGetMetricsMethod() {
    io.grpc.MethodDescriptor<application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest, application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> getGetMetricsMethod;
    if ((getGetMetricsMethod = ExternalScalerGrpc.getGetMetricsMethod) == null) {
      synchronized (ExternalScalerGrpc.class) {
        if ((getGetMetricsMethod = ExternalScalerGrpc.getGetMetricsMethod) == null) {
          ExternalScalerGrpc.getGetMetricsMethod = getGetMetricsMethod =
              io.grpc.MethodDescriptor.<application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest, application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExternalScalerMethodDescriptorSupplier("GetMetrics"))
              .build();
        }
      }
    }
    return getGetMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExternalScalerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalScalerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalScalerStub>() {
        @java.lang.Override
        public ExternalScalerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalScalerStub(channel, callOptions);
        }
      };
    return ExternalScalerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExternalScalerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalScalerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalScalerBlockingStub>() {
        @java.lang.Override
        public ExternalScalerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalScalerBlockingStub(channel, callOptions);
        }
      };
    return ExternalScalerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExternalScalerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExternalScalerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExternalScalerFutureStub>() {
        @java.lang.Override
        public ExternalScalerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExternalScalerFutureStub(channel, callOptions);
        }
      };
    return ExternalScalerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExternalScalerImplBase implements io.grpc.BindableService {

    /**
     */
    public void isActive(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsActiveMethod(), responseObserver);
    }

    /**
     */
    public void getMetricSpec(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricSpecMethod(), responseObserver);
    }

    /**
     */
    public void getMetrics(application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIsActiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
                application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse>(
                  this, METHODID_IS_ACTIVE)))
          .addMethod(
            getGetMetricSpecMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef,
                application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse>(
                  this, METHODID_GET_METRIC_SPEC)))
          .addMethod(
            getGetMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest,
                application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse>(
                  this, METHODID_GET_METRICS)))
          .build();
    }
  }

  /**
   */
  public static final class ExternalScalerStub extends io.grpc.stub.AbstractAsyncStub<ExternalScalerStub> {
    private ExternalScalerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalScalerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalScalerStub(channel, callOptions);
    }

    /**
     */
    public void isActive(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetricSpec(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetrics(application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest request,
        io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExternalScalerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExternalScalerBlockingStub> {
    private ExternalScalerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalScalerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalScalerBlockingStub(channel, callOptions);
    }

    /**
     */
    public application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse isActive(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsActiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse getMetricSpec(application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricSpecMethod(), getCallOptions(), request);
    }

    /**
     */
    public application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse getMetrics(application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExternalScalerFutureStub extends io.grpc.stub.AbstractFutureStub<ExternalScalerFutureStub> {
    private ExternalScalerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExternalScalerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExternalScalerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse> isActive(
        application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse> getMetricSpec(
        application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricSpecMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse> getMetrics(
        application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_ACTIVE = 0;
  private static final int METHODID_GET_METRIC_SPEC = 1;
  private static final int METHODID_GET_METRICS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExternalScalerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExternalScalerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IS_ACTIVE:
          serviceImpl.isActive((application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef) request,
              (io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.IsActiveResponse>) responseObserver);
          break;
        case METHODID_GET_METRIC_SPEC:
          serviceImpl.getMetricSpec((application.communication.rpc.ExternalScalerOuterClass.ScaledObjectRef) request,
              (io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricSpecResponse>) responseObserver);
          break;
        case METHODID_GET_METRICS:
          serviceImpl.getMetrics((application.communication.rpc.ExternalScalerOuterClass.GetMetricsRequest) request,
              (io.grpc.stub.StreamObserver<application.communication.rpc.ExternalScalerOuterClass.GetMetricsResponse>) responseObserver);
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

  private static abstract class ExternalScalerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExternalScalerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return application.communication.rpc.ExternalScalerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExternalScaler");
    }
  }

  private static final class ExternalScalerFileDescriptorSupplier
      extends ExternalScalerBaseDescriptorSupplier {
    ExternalScalerFileDescriptorSupplier() {}
  }

  private static final class ExternalScalerMethodDescriptorSupplier
      extends ExternalScalerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExternalScalerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExternalScalerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExternalScalerFileDescriptorSupplier())
              .addMethod(getIsActiveMethod())
              .addMethod(getGetMetricSpecMethod())
              .addMethod(getGetMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
