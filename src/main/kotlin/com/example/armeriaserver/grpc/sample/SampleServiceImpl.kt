package com.example.armeriaserver.grpc.sample

import com.wert.jvmstub.sample.Detail
import com.wert.jvmstub.sample.SampleRequest
import com.wert.jvmstub.sample.SampleResponse
import com.wert.jvmstub.sample.SampleServiceGrpc
import io.grpc.Status
import io.grpc.stub.StreamObserver
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val log = KotlinLogging.logger {  }

@Service
class SampleServiceImpl : SampleServiceGrpc.SampleServiceImplBase() {

    private final val responseDetail: Detail = Detail.newBuilder()
        .setData("response detail data")
        .addNumbers("first")
        .addNumbers("second")
        .build()

    override fun sampleUnaryCall(request: SampleRequest, responseObserver: StreamObserver<SampleResponse>) {
        val thread: String = Thread.currentThread().toString()
        log.info { "start [sampleUnaryCall] Server Thread : $thread" }

        if (request.string.equals("error")) {
            responseObserver.onError(
                Status.FAILED_PRECONDITION.withDescription("Error!!!").asException()
            )
            return
        }

        if (request.string.equals("sleep")) {
            Thread.sleep(10000)
        }


        val response = SampleResponse.newBuilder()
            .setMessage("${request.string} Server Thread : $thread")
            .setDetail(responseDetail)
            .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
        log.info { "end [sampleUnaryCall]" }
    }

    override fun sampleCallClientStream(responseObserver: StreamObserver<SampleResponse>): StreamObserver<SampleRequest> {
        val thread: String = Thread.currentThread().toString()
        log.info { "start [sampleCallClientStream] Server Thread : $thread" }

        return object: StreamObserver<SampleRequest> {
            val alphabets: ArrayList<String> = ArrayList()

            override fun onNext(value: SampleRequest) {
                alphabets.add(value.string)
                log.info { "$thread : ${value.string} , ${alphabets.size}" }
            }

            override fun onError(t: Throwable) {
                responseObserver.onError(t)
            }

            override fun onCompleted() {
                val name = alphabets.reduce{total, ele -> total + ele}
                val response = SampleResponse.newBuilder()
                    .setMessage("[sampleCallClientStream] $name Server Thread : $thread")
                    .setDetail(responseDetail)
                    .build()

                responseObserver.onNext(response)
                responseObserver.onCompleted()
            }
        }
    }

    override fun sampleCallServerStream(request: SampleRequest, responseObserver: StreamObserver<SampleResponse>) {
        val thread: String = Thread.currentThread().toString()
        log.info { "[sampleCallServerStream] Server Thread : $thread" }
        val messages = arrayOf("first", "second", "third", "fourth")

        messages.forEach {
            responseObserver.onNext(SampleResponse.newBuilder().setMessage(it).build())
        }

        responseObserver.onCompleted()
        log.info { "end [sampleCallServerStream]" }
    }

    override fun sampleCallBiStream(responseObserver: StreamObserver<SampleResponse>): StreamObserver<SampleRequest> {
        val thread: String = Thread.currentThread().toString()
        log.info { "[sampleCallBiStream] Server Thread : $thread" }

        return object: StreamObserver<SampleRequest> {
            val alphabets: ArrayList<String> = ArrayList()

            override fun onNext(value: SampleRequest) {
                alphabets.add(value.string)
                log.info { "$thread : ${value.string} , ${alphabets.size}" }
            }

            override fun onError(t: Throwable) {
                responseObserver.onError(t)
            }

            override fun onCompleted() {
                val name = alphabets.reduce{total, ele -> total + ele}
                val response = SampleResponse.newBuilder()
                    .setMessage("[sampleCallBiStream] $name Server Thread : $thread")
                    .setDetail(responseDetail)
                    .build()

                responseObserver.onNext(response)
                responseObserver.onCompleted()
            }
        }
    }
}