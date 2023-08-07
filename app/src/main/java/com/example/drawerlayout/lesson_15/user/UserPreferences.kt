package com.example.drawerlayout.lesson_15.user

import android.content.SharedPreferences
import com.example.drawerlayout.lesson_15.user.Const.USER_KEY_SHARED
import com.google.gson.Gson

class UserPreferences {

    fun read(sharedPreferences: SharedPreferences): User? {
        val json = sharedPreferences.getString(USER_KEY_SHARED, null) ?: return null
        return Gson().fromJson(json, User::class.java)
    }

    fun write(sharedPreferences: SharedPreferences, user: User) {
        val json = Gson().toJson(user)
        sharedPreferences.edit()
            .putString(USER_KEY_SHARED, json)
            .apply()
    }
}