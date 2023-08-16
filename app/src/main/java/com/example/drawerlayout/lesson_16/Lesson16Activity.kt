package com.example.drawerlayout.lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson16Binding
import java.util.zip.Inflater

class Lesson16Activity : AppCompatActivity() {

    lateinit var binding: ActivityLesson16Binding

    private var relativeLayout: RelativeLayout? = null

    private var lastButtonIndex = 0
    private var lastButtonId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson16Binding.inflate(layoutInflater)
        setContentView(binding.root)

        relativeLayout = binding.relativeLayout
        binding.addButton.setOnClickListener {
            addNewButton()
        }

        binding.newActivityRelativLayout.setOnClickListener {
            val intent = Intent(this, NewRelativViewActivity::class.java)
            startActivity(intent)
        }

        binding.newActivityConstraintLayout.setOnClickListener {
            val intent = Intent(this, NewConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addNewButton() {
        val newButton = createNewButton(lastButtonIndex, lastButtonId)

        relativeLayout?.addView(newButton)

        ++lastButtonIndex
        lastButtonId = newButton.id
    }

    private fun createNewButton(
        currentButtonIndex: Int,
        previousButtonId: Int
    ): View {
        val isFirstButton = currentButtonIndex == 0

        return Button(this).also { button ->
            button.text = "Button # $lastButtonIndex"

            button.id = View.generateViewId()

            button.layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                this.marginEnd = 10
                if (isFirstButton) {
                    this.addRule(RelativeLayout.ALIGN_PARENT_END)
                } else {
                    this.addRule(RelativeLayout.START_OF, previousButtonId)
                }
            }
        }
    }
}