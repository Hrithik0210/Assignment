package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chat_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val emeryCardView: CardView = findViewById(R.id.emeryCardView)
        val jennaCardView: CardView = findViewById(R.id.jennaCardView)

        // Set click listeners
        emeryCardView.setOnClickListener {
            val intent = Intent(this, Emery_chat::class.java)
            startActivity(intent)
        }

        jennaCardView.setOnClickListener {
            val intent = Intent(this, Jenna_Chat::class.java)
            startActivity(intent)
        }
    }
}
