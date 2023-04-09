package com.example.drawerlayout.lesson_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson11Binding

class Lesson11Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bFrag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, BlankFragment.newInstance())
            .commit()
    }
}