package com.camoutech.navigationintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.camoutech.navigationintent.adapter.ExpressionAdapter
import com.camoutech.navigationintent.datas.Dictionnary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.adapter = ExpressionAdapter(Dictionnary().datas())
    }
}