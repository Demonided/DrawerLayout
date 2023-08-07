package com.example.drawerlayout.lesson_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson15Binding
import com.example.drawerlayout.lesson_15.fact.Fact
import com.example.drawerlayout.lesson_15.fact.FactsAdapter
import com.example.drawerlayout.lesson_15.user.Const.FACTS_LIST_KEY
import com.example.drawerlayout.lesson_15.user.Const.NEW_FACT_KEY
import com.google.gson.Gson

class Lesson15Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson15Binding

    private val  adapterFact = FactsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences(FACTS_LIST_KEY, MODE_PRIVATE)

        binding.saveButton.setOnClickListener {
            val fact = Fact(binding.factEditText.text.toString(), binding.subjectEditText.text.toString())
            sharedPreferences.edit()
                .putString(NEW_FACT_KEY, createJsonFromFact(fact))
                .apply()
        }

        binding.syncButton.setOnClickListener {
            val fact = sharedPreferences.getString(NEW_FACT_KEY, null)
            if (fact != null) {
              // Тут я остановился необходимо равершить реализацию
            }
        }


    }

    private fun createJsonFromFact(fact: Fact): String {
        return Gson().toJson(fact)
    }

    private fun createFactFromJson(json: String): Fact {
        return Gson().fromJson(json, Fact::class.java   )
    }
}