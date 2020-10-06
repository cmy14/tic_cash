package com.cmy.tic_cash_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myStringArray = arrayOf("a", "b", "c")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStringArray)
        val listView: ListView = findViewById(R.id.listview)
        listView.adapter = adapter
    }
}
