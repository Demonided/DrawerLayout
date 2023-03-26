package com.example.drawerlayout.lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.drawerlayout.databinding.ActivityLessomThreeBinding

class LessonThreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityLessomThreeBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessomThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constance.REQUEST_CODE_SIGN_IN) {

        } else if (requestCode == Constance.REQUEST_CODE_SIGN_UP) {

        }

    }

    fun onClickSignIn(v: View) {
        val intent = Intent (this, com.example.drawerlayout.lesson_3.LessonThreeActivityTest::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)

    }

    fun onClickSignUp(v: View) {
        val intent = Intent (this, com.example.drawerlayout.lesson_3.LessonThreeActivityTest::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}