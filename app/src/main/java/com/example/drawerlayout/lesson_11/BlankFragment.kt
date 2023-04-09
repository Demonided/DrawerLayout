package com.example.drawerlayout.lesson_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drawerlayout.R

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1_lesson_11, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}