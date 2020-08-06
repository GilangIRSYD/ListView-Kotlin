package com.catatancodingku.kotlinlistview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.catatancodingku.kotlinlistview.Model.Member
import com.catatancodingku.kotlinlistview.R

class LlistViewAdapter (private val contex : Context, private val membersData : ArrayList<Member>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item,parent,false)

        val image : ImageView = view.findViewById(R.id.imageView)
        val name : TextView = view.findViewById(R.id.tvName)

        val item:Member = membersData.get(position)
        image.setImageResource(item.image)
        name.text = item.name

        return view
    }

    override fun getItem(position: Int): Any = membersData.get(position)

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = membersData.size

}