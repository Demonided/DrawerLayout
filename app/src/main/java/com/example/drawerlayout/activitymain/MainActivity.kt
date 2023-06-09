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

    fun openLesson5(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_5.Lesson5Activity::class.java)
        startActivity(intent)
    }

    fun openLesson6(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_6.Lesson6Activity::class.java)
        startActivity(intent)
    }

    fun openLesson7(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_7.Lesson7Activity::class.java)
        startActivity(intent)
    }

    fun openLesson8(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_8.Lesson8Activity::class.java)
        startActivity(intent)
    }

    fun openLesson9(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_9.Lesson9Activity::class.java)
        startActivity(intent)
    }

    fun openLesson10(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_10.Lesson10Activity::class.java)
        startActivity(intent)
    }

    fun openLesson11(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_11.Lesson11Activity::class.java)
        startActivity(intent)
    }

    fun openLesson12(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_12.Lesson12Activity::class.java)
        startActivity(intent)
    }

    fun openLesson13(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_13.Lesson13Activity::class.java)
        startActivity(intent)
    }

    fun openLesson14(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_14.Lesson14Activity::class.java)
        startActivity(intent)
    }

    fun openLesson15(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_15.Lesson15Activity::class.java)
        startActivity(intent)
    }
}