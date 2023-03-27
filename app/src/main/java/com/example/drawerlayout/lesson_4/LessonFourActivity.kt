package com.example.drawerlayout.lesson_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLessonFourBinding

class LessonFourActivity : AppCompatActivity() {
    lateinit var binding: ActivityLessonFourBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonFourBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_CODE_SIGN_IN) {
            val l = data?.getStringExtra(Constance.LOGIN_2)
            val p = data?.getStringExtra(Constance.PASSWORD_2)

            if (login == l && password == p) {
                binding.imPhotoFirst.visibility = View.VISIBLE
                binding.imPhotoFirst.setImageResource(avatar)
                val textInfo = "$name $name2 $name3"
                binding.tvData.text = textInfo
            } else {
                binding.imPhotoFirst.visibility = View.VISIBLE
                binding.imPhotoFirst.setImageResource(R.drawable.dula)
                binding.tvData.text = "Вы ввели не верный пароль"
            }

        } else if (requestCode == Constance.REQUEST_STATE_SIGN_UP) {
            login = data?.getStringExtra(Constance.LOGIN_2)!!
            password = data.getStringExtra(Constance.PASSWORD_2)!!
            name = data.getStringExtra(Constance.NAME_1_2)!!
            name2 = data.getStringExtra(Constance.NAME_2_2)!!
            name3 = data.getStringExtra(Constance.NAME_3_2)!!
            avatar = data.getIntExtra(Constance.AVATARKA, 0)
            binding.imPhotoFirst.visibility = View.VISIBLE
            binding.imPhotoFirst.setImageResource(avatar)
            val textInfo = "$name $name2 $name3"
            binding.tvData.text = textInfo
            binding.bSignUp.visibility = View.GONE
            binding.bSignIn.text = "Выйти"
        }

    }

    fun onClickSignIn2(v: View) {
        if (binding.imPhotoFirst.isVisible) {
            binding.imPhotoFirst.visibility = View.INVISIBLE
            binding.tvData.text = ""
            binding.bSignUp.visibility = View.VISIBLE
            binding.bSignIn.text = getString(R.string.sign_in)

        } else {
            val intent = Intent(this, LessonFourTestActivity::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
        }
    }

    fun onClickSignUp2(v: View) {
        val intent = Intent(this, com.example.drawerlayout.lesson_4.LessonFourTestActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_STATE_SIGN_UP)
    }
}