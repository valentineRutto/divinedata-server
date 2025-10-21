package com.example.com.services

import com.example.com.services.Utils.client
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

class EsvService(private val apiKey: String) {



    suspend fun getVerse(passage: String): String {

        val response: HttpResponse = client.get("https://api.esv.org/v3/passage/text/") {
            headers { append("Authorization", "Token $apiKey") }
            parameter("q", passage)
        }

        val body = Json.parseToJsonElement(response.bodyAsText()).jsonObject

        val passages = body["passages"]?.jsonArray

        return passages?.get(0)?.jsonPrimitive?.content ?: "Verse not found."
    }




}