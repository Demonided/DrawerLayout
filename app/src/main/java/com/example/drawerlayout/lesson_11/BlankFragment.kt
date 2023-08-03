package com.example.drawerlayout.lesson_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.drawerlayout.databinding.Fragment1Lesson11Binding

class BlankFragment : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: Fragment1Lesson11Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Lesson11Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.messageForFragment2.observe(activity as LifecycleOwner, {
            binding.tvMessage1.text = it
        })
        binding.bSendMessage1.setOnClickListener {
            dataModel.messageForFragment1.value = "Hello from fragment 1"
        }
        binding.bSendToActivity1.setOnClickListener {
            dataModel.messageForActivity.value = "Hello activity from fragment 1"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}