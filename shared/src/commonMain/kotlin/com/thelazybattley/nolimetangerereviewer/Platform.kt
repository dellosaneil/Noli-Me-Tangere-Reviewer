package com.thelazybattley.nolimetangerereviewer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
