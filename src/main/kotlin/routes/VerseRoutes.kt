package com.example.com.routes

import com.example.com.services.EsvService
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get


    fun Route.verseRoutes() {

        val esvService = EsvService(System.getenv("ESV_API_KEY") ?: "YOUR_ESV_API_KEY")

        get("/verse") {
            val passage = call.request.queryParameters["q"] ?: "John 3:16"
            val text = esvService.getVerse(passage)
            call.respond(mapOf("reference" to passage, "text" to text))
        }

    }
