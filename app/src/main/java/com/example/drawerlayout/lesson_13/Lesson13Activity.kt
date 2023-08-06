package com.example.drawerlayout.lesson_13

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawerlayout.databinding.ActivityLesson13Binding

class Lesson13Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson13Binding
    lateinit var sManager: SensorManager
    private var magnetic = FloatArray(9)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson13Binding.inflate(layoutInflater)
        setContentView(binding.root)
        sManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sensor = sManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        val sListener = object : SensorEventListener {
            override fun onSensorChanged(sEvent: SensorEvent?) {
                val value = sEvent?.values
                val sData = "X: ${value?.get(0)}\nY: ${value?.get(1)}\nZ: ${value?.get(2)}"
                binding.tvSensor.text = sData
            }

            override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

            }

        }
        sManager.registerListener(sListener, sensor, SensorManager.SENSOR_DELAY_NORMAL)
    }
}