package com.example.drawerlayout.lesson_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson15Binding

class Lesson15Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson15Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}