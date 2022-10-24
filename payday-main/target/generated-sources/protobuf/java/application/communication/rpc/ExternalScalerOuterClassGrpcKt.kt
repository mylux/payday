package application.communication.rpc

import application.communication.rpc.ExternalScalerGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * application.communication.rpc.ExternalScaler.
 */
public object ExternalScalerGrpcKt {
  public const val SERVICE_NAME: String = ExternalScalerGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = ExternalScalerGrpc.getServiceDescriptor()

  public val isActiveMethod:
      MethodDescriptor<ExternalScalerOuterClass.ScaledObjectRef, ExternalScalerOuterClass.IsActiveResponse>
    @JvmStatic
    get() = ExternalScalerGrpc.getIsActiveMethod()

  public val getMetricSpecMethod:
      MethodDescriptor<ExternalScalerOuterClass.ScaledObjectRef, ExternalScalerOuterClass.GetMetricSpecResponse>
    @JvmStatic
    get() = ExternalScalerGrpc.getGetMetricSpecMethod()

  public val getMetricsMethod:
      MethodDescriptor<ExternalScalerOuterClass.GetMetricsRequest, ExternalScalerOuterClass.GetMetricsResponse>
    @JvmStatic
    get() = ExternalScalerGrpc.getGetMetricsMethod()

  /**
   * A stub for issuing RPCs to a(n) application.communication.rpc.ExternalScaler service as
   * suspending coroutines.
   */
  @StubFor(ExternalScalerGrpc::class)
  public class ExternalScalerCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ExternalScalerCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        ExternalScalerCoroutineStub = ExternalScalerCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun isActive(request: ExternalScalerOuterClass.ScaledObjectRef, headers: Metadata
        = Metadata()): ExternalScalerOuterClass.IsActiveResponse = unaryRpc(
      channel,
      ExternalScalerGrpc.getIsActiveMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMetricSpec(request: ExternalScalerOuterClass.ScaledObjectRef,
        headers: Metadata = Metadata()): ExternalScalerOuterClass.GetMetricSpecResponse = unaryRpc(
      channel,
      ExternalScalerGrpc.getGetMetricSpecMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMetrics(request: ExternalScalerOuterClass.GetMetricsRequest,
        headers: Metadata = Metadata()): ExternalScalerOuterClass.GetMetricsResponse = unaryRpc(
      channel,
      ExternalScalerGrpc.getGetMetricsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the application.communication.rpc.ExternalScaler service based on
   * Kotlin coroutines.
   */
  public abstract class ExternalScalerCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for application.communication.rpc.ExternalScaler.IsActive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isActive(request: ExternalScalerOuterClass.ScaledObjectRef):
        ExternalScalerOuterClass.IsActiveResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method application.communication.rpc.ExternalScaler.IsActive is unimplemented"))

    /**
     * Returns the response to an RPC for
     * application.communication.rpc.ExternalScaler.GetMetricSpec.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMetricSpec(request: ExternalScalerOuterClass.ScaledObjectRef):
        ExternalScalerOuterClass.GetMetricSpecResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method application.communication.rpc.ExternalScaler.GetMetricSpec is unimplemented"))

    /**
     * Returns the response to an RPC for application.communication.rpc.ExternalScaler.GetMetrics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMetrics(request: ExternalScalerOuterClass.GetMetricsRequest):
        ExternalScalerOuterClass.GetMetricsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method application.communication.rpc.ExternalScaler.GetMetrics is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExternalScalerGrpc.getIsActiveMethod(),
      implementation = ::isActive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExternalScalerGrpc.getGetMetricSpecMethod(),
      implementation = ::getMetricSpec
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExternalScalerGrpc.getGetMetricsMethod(),
      implementation = ::getMetrics
    )).build()
  }
}
