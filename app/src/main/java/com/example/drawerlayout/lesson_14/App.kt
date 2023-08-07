package com.example.drawerlayout.lesson_14

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class App : Application() {

    var darkTheme = false

    override fun onCreate() {
        super.onCreate()
        // Достать ШаредПреф если он есть
    }

    fun switchTheme(darkThemeEnable: Boolean) {
        darkTheme = darkThemeEnable
        AppCompatDelegate.setDefaultNightMode(
            if (darkThemeEnable) {
                AppCompatDelegate.MODE_NIGHT_YES
            } else {
                AppCompatDelegate.MODE_NIGHT_NO
            }
        )
    }
}