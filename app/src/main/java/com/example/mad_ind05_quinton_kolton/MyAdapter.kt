package com.example.mad_ind05_quinton_kolton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_quinton_kolton.databinding.RecyclerviewRowBinding
import layout.Team

class MyAdapter(val teamList: List<Team>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItem(team: Team){
            binding.tvTeamName.text = team.name
            binding.textView2.text = team.nickName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val team = teamList[position]
        holder.bindItem(team)

    }

    override fun getItemCount(): Int {
        return teamList.size
    }
}