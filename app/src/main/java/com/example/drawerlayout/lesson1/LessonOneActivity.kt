package com.example.drawerlayout.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLessonOneBinding

class LessonOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonresult.setOnClickListener {

            val result = binding.letCount.text.toString()
            binding.imPhoto.visibility = View.VISIBLE
            when (result) {

                Constance.HUSBAND -> {
                    binding.textresult.visibility = View.VISIBLE
                    val tempText = Constance.HUSBAND_LIKE
                    binding.textresult.text = tempText
                    binding.imPhoto.setImageResource(R.drawable.maks)
                }

                Constance.WIFE -> {
                    binding.textresult.visibility = View.VISIBLE
                    val tempText = Constance.WIFE_LIKE
                    binding.textresult.text = tempText
                    binding.imPhoto.setImageResource(R.drawable.julia_1)
                }

                Constance.FRIEND -> {
                    binding.textresult.visibility = View.VISIBLE
                    val tempText = Constance.FRIEND_LIKE
                    binding.textresult.text = tempText
                    binding.imPhoto.setImageResource(R.drawable.alex)
                }

                else -> {
                    binding.textresult.visibility = View.VISIBLE
                    binding.textresult.text = "Вы ввели что-то не так"
                }
            }
        }
    }
}

