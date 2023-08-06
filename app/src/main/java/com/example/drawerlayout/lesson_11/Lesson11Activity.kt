package com.example.drawerlayout.lesson_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson11Binding

class Lesson11Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson11Binding
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        openFrag(BlankFragment.newInstance(), R.id.place_holder)
        openFrag(BlankFragment2.newInstance(), R.id.place_holder_2)
        dataModel.messageForActivity.observe(this, {
            binding.textView8.text = it
        })
        }

    private fun openFrag(f: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }
}