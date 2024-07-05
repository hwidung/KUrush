package com.example.kurush_frontend.matching.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kurush_frontend.data.HorizonData
import com.example.kurush_frontend.databinding.ItemMatchingListHorizonBinding

class HorizonRVAdapter(item : ArrayList<HorizonData>) : RecyclerView.Adapter<HorizonRVAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemMatchingListHorizonBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: HorizonData) {
            binding.tvItemMatchingListHorizonNickname.text = item.nickname
            binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizonRVAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HorizonRVAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}