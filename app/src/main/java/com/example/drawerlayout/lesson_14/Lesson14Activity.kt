package com.example.drawerlayout.lesson_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson14Binding

class Lesson14Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson14Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}