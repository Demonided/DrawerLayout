package com.example.drawerlayout.lesson_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson9Binding

class Lesson9Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson9Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}