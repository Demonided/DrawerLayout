package com.example.drawerlayout.lesson_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLessomThreeBinding

@Suppress("DEPRECATION")
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
            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASSWORD)

            if (login == l && password == p) {
                binding.inAvatar.visibility = View.VISIBLE
                binding.inAvatar.setImageResource(avatarImageId)
                val textInfo = "$name $name2 $name3"
                binding.tvInfo.text = textInfo

            } else {
                binding.inAvatar.visibility = View.VISIBLE
                binding.inAvatar.setImageResource(R.drawable.dula)
                binding.tvInfo.text = "Такого аккаунта не существует"
            }

        } else if (requestCode == Constance.REQUEST_CODE_SIGN_UP) {
            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data.getStringExtra(Constance.PASSWORD)!!
            name = data.getStringExtra(Constance.NAME)!!
            name2 = data.getStringExtra(Constance.NAME2)!!
            name3 = data.getStringExtra(Constance.NAME3)!!
            avatarImageId = data.getIntExtra(Constance.AVATAR_ID, 0)
            binding.inAvatar.visibility = View.VISIBLE
            binding.inAvatar.setImageResource(avatarImageId)
            val textInfo = "$name $name2 $name3"
            binding.tvInfo.text = textInfo
            binding.bHide.visibility = View.GONE
            binding.bExit.text = "Выйти"
        }
    }

    fun onClickSignIn(v: View) {
        if (binding.inAvatar.isVisible) {
            binding.inAvatar.visibility = View.INVISIBLE
            binding.tvInfo.text = ""
            binding.bHide.visibility = View.VISIBLE
            binding.bExit.text = getString(R.string.sign_in)


        } else {
            val intent = Intent(this, LessonThreeActivityTest::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
        }
    }

    fun onClickSignUp(v: View) {
        val intent = Intent (this, com.example.drawerlayout.lesson_3.LessonThreeActivityTest::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}