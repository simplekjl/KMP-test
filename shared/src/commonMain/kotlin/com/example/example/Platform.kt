package com.example.example

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform