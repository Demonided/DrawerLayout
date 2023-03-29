package com.example.drawerlayout.lesson_6

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.drawerlayout.databinding.ActivityLesson6Binding

class Lesson6Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson6Binding
    private var launcher: ActivityResultLauncher<Intent>? = null

    private var text: String = Constance.TEXT_RESULT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            binding.tTextNewColback.text = text
            if (result.resultCode == RESULT_OK) {
                val newText = result.data?.getStringArrayExtra("Key1")


            }
        }
    }

    fun onClickNewLesson6(v: View) {
        launcher?.launch(Intent(this, LessonTest6Activity::class.java))
    }


}