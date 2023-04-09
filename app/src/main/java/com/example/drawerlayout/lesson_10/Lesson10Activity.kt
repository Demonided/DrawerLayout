package com.example.drawerlayout.lesson_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson10Binding

class Lesson10Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            nView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.float_1 -> {
                        Toast.makeText(this@Lesson10Activity, "Привет", Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@Lesson10Activity, "Как дела", Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@Lesson10Activity, "Что делаешь?", Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@Lesson10Activity, "Какие планы?", Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@Lesson10Activity, "Как бы да", Toast.LENGTH_SHORT).show()
                    }
                    R.id.float_2 -> Toast.makeText(this@Lesson10Activity, "Привет", Toast.LENGTH_SHORT).show()
                }
                draver.closeDrawer(GravityCompat.START)
                true
            }
            open.setOnClickListener {
                draver.openDrawer(GravityCompat.START)
            }
        }
    }
}