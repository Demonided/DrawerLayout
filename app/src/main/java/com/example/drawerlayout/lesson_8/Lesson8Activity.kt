package com.example.drawerlayout.lesson_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesoon8Binding

class Lesson8Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesoon8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesoon8Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}