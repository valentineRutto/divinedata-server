package com.example.com

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import kotlinx.serialization.json.Json

fun Application.contentNegotiation() {
    install(io.ktor.server.plugins.contentnegotiation.ContentNegotiation) { json(  Json {
        prettyPrint = true
        isLenient = true
        ignoreUnknownKeys = true
    }) }

}