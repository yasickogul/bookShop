package com.example.bookshop

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // ✅ Load the menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu) // Ensure this menu file exists
        return true
    }

    // ✅ Handle menu clicks (Corrected method)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                startActivity(Intent(this, HomeScreen::class.java))
                return true
            }
            R.id.nav_categories -> {
                startActivity(Intent(this, CategoryActivity::class.java))
                return true
            }
            R.id.nav_cart -> {
                startActivity(Intent(this, CartActivity::class.java))
                return true
            }
            R.id.nav_profile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}