package com.example.firstmultiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform