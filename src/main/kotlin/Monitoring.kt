package com.example.com

import io.ktor.serialization.gson.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.application.install
import io.ktor.server.plugins.calllogging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.request.path
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.slf4j.event.*
import kotlin.text.startsWith

fun Application.configureMonitoring() {

    install(CallLogging) {

        CallLoggingConfig().level = Level.INFO
        CallLoggingConfig().filter { call -> call.request.path().startsWith("/") }

    }

}
