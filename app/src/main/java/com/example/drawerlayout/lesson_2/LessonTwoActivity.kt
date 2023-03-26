package com.example.drawerlayout.lesson_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLessonTwoBinding

class LessonTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}