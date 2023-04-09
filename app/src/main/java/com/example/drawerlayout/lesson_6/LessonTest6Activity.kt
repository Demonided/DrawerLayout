package com.example.drawerlayout.lesson_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.drawerlayout.databinding.ActivityLessonTest6Binding

class LessonTest6Activity : AppCompatActivity() {
    lateinit var binding: ActivityLessonTest6Binding
    private var signState = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonTest6Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickTest6(v: View) {
        val i = Intent()
        i.putExtra(Constance.TEXT_RESULT_KEY, binding.edContext.text.toString())
        setResult(RESULT_OK, i)
        finish()
    }
}