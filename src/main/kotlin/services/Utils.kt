package com.example.com.services

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.DefaultRequest.Plugin.install
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.install

object Utils {

    val client = HttpClient(CIO) {
        install(ContentNegotiation) { json() }
    }



}