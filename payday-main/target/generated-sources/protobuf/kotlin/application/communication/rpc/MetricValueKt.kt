//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: external_scaler.proto

package application.communication.rpc;

@kotlin.jvm.JvmSynthetic
inline fun metricValue(block: application.communication.rpc.MetricValueKt.Dsl.() -> kotlin.Unit): application.communication.rpc.ExternalScalerOuterClass.MetricValue =
  application.communication.rpc.MetricValueKt.Dsl._create(application.communication.rpc.ExternalScalerOuterClass.MetricValue.newBuilder()).apply { block() }._build()
object MetricValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: application.communication.rpc.ExternalScalerOuterClass.MetricValue.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: application.communication.rpc.ExternalScalerOuterClass.MetricValue.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): application.communication.rpc.ExternalScalerOuterClass.MetricValue = _builder.build()

    /**
     * <code>string metricName = 1;</code>
     */
    var metricName: kotlin.String
      @JvmName("getMetricName")
      get() = _builder.getMetricName()
      @JvmName("setMetricName")
      set(value) {
        _builder.setMetricName(value)
      }
    /**
     * <code>string metricName = 1;</code>
     */
    fun clearMetricName() {
      _builder.clearMetricName()
    }

    /**
     * <code>int64 metricValue = 2;</code>
     */
    var metricValue: kotlin.Long
      @JvmName("getMetricValue")
      get() = _builder.getMetricValue()
      @JvmName("setMetricValue")
      set(value) {
        _builder.setMetricValue(value)
      }
    /**
     * <code>int64 metricValue = 2;</code>
     */
    fun clearMetricValue() {
      _builder.clearMetricValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun application.communication.rpc.ExternalScalerOuterClass.MetricValue.copy(block: application.communication.rpc.MetricValueKt.Dsl.() -> kotlin.Unit): application.communication.rpc.ExternalScalerOuterClass.MetricValue =
  application.communication.rpc.MetricValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()
