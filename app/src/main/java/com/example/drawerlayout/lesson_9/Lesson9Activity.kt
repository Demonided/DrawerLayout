package com.example.drawerlayout.lesson_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson9Binding

@Suppress("DEPRECATION", "UNUSED_EXPRESSION")
class Lesson9Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson9Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNav.selectedItemId = R.id.item4

        binding.bNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Item 4", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}