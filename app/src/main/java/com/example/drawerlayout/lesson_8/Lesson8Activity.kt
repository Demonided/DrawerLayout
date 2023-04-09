package com.example.drawerlayout.lesson_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesoon8Binding

class Lesson8Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesoon8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesoon8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Maks Shostak"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.lesson_8_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
            R.id.syncNow -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}