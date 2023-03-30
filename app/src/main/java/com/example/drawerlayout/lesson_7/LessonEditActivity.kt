package com.example.drawerlayout.lesson_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLessonEditBinding
import kotlin.math.sign

class LessonEditActivity : AppCompatActivity() {
    lateinit var binding: ActivityLessonEditBinding
    private var indexImage = 0
    private var imageId = R.drawable.smail_1
    private val imageIdList = listOf(
        R.drawable.smail_1,
        R.drawable.smail_2,
        R.drawable.smail_3,
        R.drawable.smail_4,
        R.drawable.smail_5,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        editButtons()
    }

    private fun editButtons() = with(binding) {
        bNextImage.setOnClickListener {
            indexImage++
            if (indexImage > imageIdList.size - 1) indexImage = 0
            imageId = imageIdList[indexImage]
            imageViewSmail.setImageResource(imageId)
        }

        bDoneSmail.setOnClickListener {
            val smail = Smail(imageId, edTitle.text.toString(), edDisc.text.toString())
            val editIntent = Intent().apply {
                putExtra("smail", smail)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}