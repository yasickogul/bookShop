package com.example.bookshop // Adjust the package name based on your project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Disable the ActionBar (AppBar)
        supportActionBar?.hide()
        setContentView(R.layout.activity_get_start)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            // Navigate to another screen or start an action here
            // For now, we'll just display a log message
            // Example: Navigate to another activity or screen
        }
    }
}
