package com.example.drawerlayout.lesson_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson5Binding
import kotlin.math.pow
import kotlin.math.sqrt


class Lesson5Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson5Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun onClickResultPifagor(v: View) {
        if (!isFieldEmpty()) {
            val result = getString(R.string.result_info_pifagor) + getResult()
            binding.resultInfoPifagor.text = result

        }
    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if (edA.text.isNullOrEmpty()) edA.error = "Поле дожно быть заполнено"
            if (edB.text.isNullOrEmpty()) edB.error = "Поле дожно быть заполнено"
            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
        }
    }

    private fun getResult(): String {
        val a: Double
        val b: Double
        binding.apply {
            a = edA.text.toString().toDouble()
            b = edB.text.toString().toDouble()
        }

        return sqrt((a.pow(2) + b.pow(2))).toString()

    }
}