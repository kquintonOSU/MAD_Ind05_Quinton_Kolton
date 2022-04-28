package com.example.mad_ind05_quinton_kolton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mad_ind05_quinton_kolton.databinding.ActivityMainBinding
import layout.TeamDataModel

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MyAdapter(TeamDataModel.teamList)
        binding?.rvTeamNames?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}