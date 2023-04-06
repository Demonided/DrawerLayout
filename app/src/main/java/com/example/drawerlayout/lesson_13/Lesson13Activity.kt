package com.example.drawerlayout.lesson_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson13Binding

class Lesson13Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson13Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}