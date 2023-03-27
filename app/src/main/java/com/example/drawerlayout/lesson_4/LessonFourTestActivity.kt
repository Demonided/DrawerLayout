package com.example.drawerlayout.lesson_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLessonFourTestBinding

class LessonFourTestActivity : AppCompatActivity() {
    lateinit var binding: ActivityLessonFourTestBinding
    private var signState2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonFourTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        signState2 = intent.getStringExtra(Constance.SIGN_STATE)!!

        if (signState2 == Constance.SIGN_IN_STATE) {
            binding.edName1.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
            binding.bAvatarka.visibility = View.GONE
        }

    }

    fun onClickReady(v: View) {
        if (signState2 == Constance.SIGN_UP_STATE){
            var intent = Intent()
            intent.putExtra(Constance.LOGIN_2, binding.edLogin2.text.toString())
            intent.putExtra(Constance.PASSWORD_2, binding.edPassword2.text.toString())
            intent.putExtra(Constance.NAME_1_2, binding.edName1.text.toString())
            intent.putExtra(Constance.NAME_2_2, binding.edName2.text.toString())
            intent.putExtra(Constance.NAME_3_2, binding.edName3.text.toString())
            if (binding.bAvatarka.isVisible)intent.putExtra(Constance.AVATARKA, R.drawable.maks)
            setResult(RESULT_OK, intent)
            finish()
        } else if (signState2 == Constance.SIGN_IN_STATE) {
            intent.putExtra(Constance.LOGIN_2, binding.edLogin2.text.toString())
            intent.putExtra(Constance.PASSWORD_2, binding.edPassword2.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }

    }

    fun onClickAvatarka(v: View) {
        binding.imPhotoLast.visibility = View.VISIBLE
    }
}