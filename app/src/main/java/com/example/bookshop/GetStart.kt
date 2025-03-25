package com.example.bookshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Disable the ActionBar (AppBar)
        supportActionBar?.hide()
        setContentView(R.layout.activity_get_start)

        // Set padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button by ID
        val startButton: Button = findViewById(R.id.startButton)

        // Set a click listener on the "Get Started" button
        startButton.setOnClickListener {
            // Start LoginActivity when the button is clicked
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}
