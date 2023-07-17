package com.camoutech.navigationintent.adapter

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.camoutech.navigationintent.R

class ExpressionViewHolder(var view: View): RecyclerView.ViewHolder(view) {
    val button: Button = view.findViewById(R.id.expression_buttons)
}