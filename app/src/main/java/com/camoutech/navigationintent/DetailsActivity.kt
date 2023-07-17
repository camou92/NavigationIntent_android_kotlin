package com.camoutech.navigationintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val nameText: TextView = findViewById(R.id.detail_name)
        val detailDesc: TextView = findViewById(R.id.detail_desc)
    }
}