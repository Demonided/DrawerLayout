package com.example.drawerlayout.lesson_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.drawerlayout.databinding.ActivityLesson14Binding

const val PRACTICUM_EXAMPLE_PREFERENCES = "practicum_example_preferences"
const val EDIT_TEXT_KEY = "key_for_edit_text"

class Lesson14Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPrefs = getSharedPreferences(PRACTICUM_EXAMPLE_PREFERENCES, MODE_PRIVATE)

        val editText = binding.editText
        val saveButton = binding.saveEditText
        val restoreButton = binding.restoreEditText

        editText.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))

        saveButton.setOnClickListener {
            sharedPrefs.edit()
                .putString(EDIT_TEXT_KEY, editText.editableText.toString())
                .apply()

            Toast.makeText(applicationContext, "Сохранили значение: ${editText.editableText}", Toast.LENGTH_LONG).show()
        }

        restoreButton.setOnClickListener {
            editText.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))
        }
    }
}