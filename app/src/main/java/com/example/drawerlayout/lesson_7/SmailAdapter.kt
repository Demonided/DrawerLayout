package com.example.drawerlayout.lesson_7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.SmailItemBinding


class SmailAdapter: RecyclerView.Adapter<SmailAdapter.SmailHolder>() {
    val smailList = ArrayList<Smail>()
    class SmailHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = SmailItemBinding.bind(item)
        fun bind(smail: Smail) = with(binding) {
            imSmail.setImageResource(smail.imageId)
            twSmail.text = smail.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmailHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.smail_item, parent, false)
        return SmailHolder(view)
    }

    override fun getItemCount(): Int {
        return smailList.size
    }

    override fun onBindViewHolder(holder: SmailHolder, position: Int) {
        holder.bind(smailList[position])
    }

    public fun addSmail(smail: Smail){
        smailList.add(smail)
        notifyDataSetChanged()
    }

    public fun clearSmail() {
        smailList.removeLast()
        notifyDataSetChanged()
    }
}