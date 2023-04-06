package com.example.drawerlayout.lesson_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson12Binding

class Lesson12Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}