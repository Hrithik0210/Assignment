package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 5 seconds before opening the Chat_List activity
        Handler().postDelayed({
            startActivity(Intent(this, Chat_List::class.java))
            finish() // Close the SplashActivity
        }, 5000) // 5000 milliseconds = 5 seconds
    }
}