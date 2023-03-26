package com.example.drawerlayout.activitymain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import com.example.drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            open.setOnClickListener {
                draver.openDrawer(GravityCompat.START)
            }
        }
    }

    fun openLesson1(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson1.LessonOneActivity::class.java)
        startActivity(intent)
    }

    fun openLesson2(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_2.LessonTwoActivity::class.java)
        startActivity(intent)
    }

    fun openLesson3(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_3.LessonThreeActivity::class.java)
        startActivity(intent)
    }

    fun openLesson4(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_4.LessonFourActivity::class.java)
        startActivity(intent)
    }
}