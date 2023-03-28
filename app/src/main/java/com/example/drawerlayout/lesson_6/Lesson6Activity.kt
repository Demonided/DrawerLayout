package com.example.drawerlayout.lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson6Binding

class Lesson6Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}