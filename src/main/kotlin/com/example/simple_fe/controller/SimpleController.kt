package com.example.simple_fe.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@RestController
class SimpleController(private val webClient: WebClient) {
    @GetMapping("/ping")
    suspend fun getPing(): String {
//        return "pong"
        return webClient.get()
            .uri("/pong")
            .retrieve()
            .awaitBody<String>()
    }
}
