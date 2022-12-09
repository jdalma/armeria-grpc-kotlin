package com.example.armeriaserver.grpc.sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController{

    @GetMapping("/success")
    fun sample(): String {
        return "success"
    }
}