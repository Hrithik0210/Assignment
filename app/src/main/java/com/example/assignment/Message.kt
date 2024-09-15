package com.example.assignment

import android.graphics.Bitmap

data class Message(
    val content: String? = null, // Text content
    val image: Bitmap? = null    // Image content (optional)
)
