package com.example.drawerlayout.lesson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLessonFourBinding

class LessonFourActivity : AppCompatActivity() {

    lateinit var binding: ActivityLessonFourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}