package application.communication.rpc

import application.main.EntryPoint
import io.grpc.Server
import io.grpc.ServerBuilder

class KedaServer(
    val port: Int,
    private val entrypoint: EntryPoint = EntryPoint(),
    val server: Server = ServerBuilder.forPort(port).addService(ExternalScalerService(entrypoint)).build(),
) {
    fun start() {
        entrypoint.apiTodayPreLoad()
        server.start()
        println("Server Running on port ${port}")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("Server shutting down...")
                this@KedaServer.stop()
                println("Shutdown completed")
            }
        )
    }

    fun stop() {
        server.shutdown()
    }

    fun hold() {
        server.awaitTermination()
    }

    internal class ExternalScalerService(private val entrypoint: EntryPoint) : ExternalScalerGrpcKt.ExternalScalerCoroutineImplBase() {
        override suspend fun isActive(
            request: ExternalScalerOuterClass.ScaledObjectRef
        ): ExternalScalerOuterClass.IsActiveResponse{
            println("Will do")
            return ExternalScalerOuterClass.IsActiveResponse.newBuilder().apply {
                result = entrypoint.apiToday(
                    mapOf(
                        "country" to request.scalerMetadataMap["country"]!!,
                        "ordinal" to request.scalerMetadataMap["ordinal"]!!,
                        "timezone" to request.scalerMetadataMap["timezone"]!!,
                    )
                )
                //result = true
            }.build()
        }
    }
}

fun main(args: Array<String>) {
    val port = 50051
    val server = KedaServer(port)
    server.start()
    server.hold()
}