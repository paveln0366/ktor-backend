package com.example.plugins

import com.example.features.cache.InMemoryCache
import com.example.features.login.LoginReceiveRemote
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/login") {
            val login = call.receive(LoginReceiveRemote::class)
            if (InMemoryCache)
            call.respond(
                listOf(
                    Test(text = "1"),
                    Test(text = "2"),
                )
            )
        }
    }
}
