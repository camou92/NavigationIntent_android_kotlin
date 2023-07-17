package com.camoutech.navigationintent.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.camoutech.navigationintent.R
import com.camoutech.navigationintent.model.Word

class ExpressionAdapter(val expressions: List<Word>): RecyclerView.Adapter<ExpressionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpressionViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.expression_layout, parent, false)
        return ExpressionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpressionViewHolder, position: Int) {
        val expression = expressions[position]
        holder.button.text = expression.name
        holder.button.setOnClickListener {}
    }

    override fun getItemCount(): Int {
        return expressions.size
    }

}