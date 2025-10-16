package com.example.com.services

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json

class EsvService(apiKey: String) {

    val client = HttpClient(CIO) {
        install(ContentNegotiation) { json() }
    }


}