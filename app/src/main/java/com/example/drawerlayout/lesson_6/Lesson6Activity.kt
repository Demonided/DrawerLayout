package com.example.drawerlayout.lesson_6


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.drawerlayout.databinding.ActivityLesson6Binding

class Lesson6Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson6Binding
    private var launcher: ActivityResultLauncher<Intent>? = null
    private var launcher2: ActivityResultLauncher<Intent>? = null
    private var launcher3: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            binding.editTextTextPassword
            if (result.resultCode == RESULT_OK) {
                val newText = result.data?.getStringExtra(Constance.TEXT_RESULT_KEY)
                newText?.let { binding.tTextNewColback.text = it }
            }
        }

        launcher2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result: ActivityResult ->
            if (result.resultCode == RESULT_OK) {
                val newText = result.data?.getStringExtra(Constance.TEXT_RESULT_KEY)
                newText?.let { binding.tTextNewColback.text = it }
            }
        }

        launcher3 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result: ActivityResult ->
            if (result.resultCode == RESULT_OK) {
                val newText = result.data?.getStringExtra(Constance.TEXT_RESULT_KEY)
                newText?.let { binding.tTextNewColback.text = it }
            }
        }

    }

    fun onClickNewLesson6(v: View) {
        launcher?.launch(Intent(this, LessonTest6Activity::class.java))
    }

    fun onClickNewPassword(v: View) {
        launcher2?.launch(Intent(this, LessonTest6Activity::class.java))
    }

    fun onClickImageView(v: View) {
        launcher3?.launch(Intent(this, LessonTest6Activity::class.java))
    }
}