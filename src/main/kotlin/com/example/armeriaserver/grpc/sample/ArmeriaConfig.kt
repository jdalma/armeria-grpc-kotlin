package com.example.armeriaserver.grpc.sample

import com.example.armeriaserver.grpc.sample.SampleServiceImpl
import com.linecorp.armeria.internal.common.grpc.GrpcStatus
import com.linecorp.armeria.server.docs.DocService
import com.linecorp.armeria.server.grpc.GrpcService
import com.linecorp.armeria.server.logging.AccessLogWriter
import com.linecorp.armeria.server.logging.ContentPreviewingService
import com.linecorp.armeria.server.logging.LoggingService
import com.linecorp.armeria.server.tomcat.TomcatService
import com.linecorp.armeria.spring.ArmeriaServerConfigurator
import com.wert.jvmstub.sample.SampleResponse
import io.grpc.protobuf.StatusProto
import io.grpc.stub.StreamObserver
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.nio.charset.StandardCharsets


@Configuration
class ArmeriaConfig(
    private val sampleServiceImpl: SampleServiceImpl
) {

    @Bean
    fun armeriaServerConfigurator(context: ServletWebServerApplicationContext): ArmeriaServerConfigurator {
        val grpcService: GrpcService = GrpcService.builder()
                                    .addService(sampleServiceImpl)
                                    .build()
        //          .addService(ProtoReflectionService.newInstance())
        //            .useBlockingTaskExecutor(true) // blocking 활성화

        val container = context.webServer as TomcatWebServer
        container.start()

        return ArmeriaServerConfigurator { builder ->
            builder.accessLogWriter(AccessLogWriter.combined(), false)
            builder.decorator(LoggingService.newDecorator())
            builder.decorator(ContentPreviewingService.newDecorator(500, StandardCharsets.UTF_8))

            // tomcatService 바인딩
            builder.serviceUnder("/",  TomcatService.of(container.tomcat))

            // stub 구현체 등록
            builder.service(grpcService)

            // Armeria Service 문서 활성화
            builder.serviceUnder("/docs", DocService())
        }
    }

    @Bean
    fun sampleStream(): StreamObserver<SampleResponse> {
        return object : StreamObserver<SampleResponse> {

            override fun onNext(value: SampleResponse) {
                println(Thread.currentThread().toString() + "GrpcClient#sampleCall - onNext : " + value)
            }

            override fun onError(t: Throwable) {
                println(Thread.currentThread().toString() + "GrpcClient#sampleCall - onError")
                println(StatusProto.fromThrowable(t))
                println(GrpcStatus.fromThrowable(t))
            }

            override fun onCompleted() {
                println(Thread.currentThread().toString() + "GrpcClient#sampleCall - onCompleted")
            }
        }
    }
}