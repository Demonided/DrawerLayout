package com.example.drawerlayout.lesson_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson7Binding

class Lesson7Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}