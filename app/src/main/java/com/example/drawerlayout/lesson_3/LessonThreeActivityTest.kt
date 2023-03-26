package com.example.drawerlayout.lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.drawerlayout.databinding.ActivityLessonThreeTestBinding

class LessonThreeActivityTest : AppCompatActivity() {
    lateinit var binding: ActivityLessonThreeTestBinding
    private var signState = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonThreeTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState == Constance.SIGN_IN_STATE) {
            binding.edName.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
            binding.bAvatar.visibility = View.INVISIBLE
        }
    }

    fun omClickDone(v: View) {
        if (signState == Constance.SIGN_IN_STATE) {

        }
    }

    fun onClickAvatar(v: View) {

        binding.imAvatar.visibility = View.VISIBLE
    }
}

