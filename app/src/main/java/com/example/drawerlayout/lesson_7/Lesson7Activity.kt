package com.example.drawerlayout.lesson_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson7Binding

class Lesson7Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson7Binding
    private val adapter = SmailAdapter()
    private var editLauncher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson7Binding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        clearOne()
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == RESULT_OK){
                adapter.addSmail(it.data?.getSerializableExtra("smail") as Smail)
            }
        }
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@Lesson7Activity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                editLauncher?.launch(Intent(this@Lesson7Activity, LessonEditActivity::class.java))
            }
        }
    }

    private fun clearOne() {
        binding.apply {
            rcView.adapter = adapter
            buttonClear.setOnClickListener {
                adapter.clearSmail()
            }
        }
    }
}