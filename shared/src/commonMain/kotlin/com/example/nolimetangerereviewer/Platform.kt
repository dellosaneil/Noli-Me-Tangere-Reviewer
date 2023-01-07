package com.example.nolimetangerereviewer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform