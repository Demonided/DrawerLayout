package com.example.drawerlayout.lesson_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesoon7Binding

class Lesoon7Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesoon7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesoon7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}