package com.etoolkit.peopleinspacerightnow.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.etoolkit.peopleinspacerightnow.R
import com.etoolkit.peopleinspacerightnow.domain.model.Astro

class AstroAdapter() : RecyclerView.Adapter<AstroAdapter.AstroViewHolder>() {

    var listData : List<Astro.People> = listOf()

    class AstroViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var textName = view.findViewById<TextView>(R.id.textName)
        var textCraft = view.findViewById<TextView>(R.id.textCraft)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AstroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return AstroViewHolder(view)
    }

    override fun onBindViewHolder(holder: AstroViewHolder, position: Int) {
        holder.textCraft.text = listData[position].craft
        holder.textName.text = listData[position].name
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Astro.People>){
        listData = list
        notifyDataSetChanged()
    }
}