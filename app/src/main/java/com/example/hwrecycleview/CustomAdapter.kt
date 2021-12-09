package com.example.hwrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val phones:ArrayList<Phone>): RecyclerView.Adapter<CustomAdapter.DataHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
            val dataHolder:DataHolder = DataHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.custom_layout, parent,false))
    return dataHolder
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
            val phone:Phone = phones.get(position)
        holder.img.setImageResource(phone.img)
        holder.name.text = phone.name
        holder.brand.text = phone.brand


    }

    override fun getItemCount(): Int {
        return phones.size
    }
    class DataHolder(view:View): RecyclerView.ViewHolder(view){
        val img:ImageView = view.findViewById(R.id.imView)
        val name:TextView = view.findViewById(R.id.nameView)
        val brand:TextView = view.findViewById(R.id.brandView)
    }
}