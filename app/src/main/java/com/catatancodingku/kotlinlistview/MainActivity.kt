package com.catatancodingku.kotlinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.catatancodingku.kotlinlistview.Adapter.LlistViewAdapter
import com.catatancodingku.kotlinlistview.Model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val membersData = ArrayList<Member>()

        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))
        membersData.add(Member("Muhammad \nbin Alwi Al Haddad" , "Betawi", R.drawable.hadad))

        val adapter = LlistViewAdapter(this,membersData)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, membersData.get(position).name, Toast.LENGTH_SHORT).show()
        }

    }
}