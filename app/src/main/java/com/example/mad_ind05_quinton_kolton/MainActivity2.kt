package com.example.mad_ind05_quinton_kolton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_ind05_quinton_kolton.databinding.ActivityMain2Binding
import com.example.mad_ind05_quinton_kolton.databinding.ActivityMainBinding
import layout.Team

class MainActivity2 : AppCompatActivity() {
    var binding: ActivityMain2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)


        val name = intent.getStringExtra("name")
        val nickName = intent.getStringExtra("nickName")
        val area = intent.getStringExtra("area")
        binding!!.myTextView.text = name
        binding!!.myTextView2.text = nickName
        binding!!.myTextView3.text = area

    }
}