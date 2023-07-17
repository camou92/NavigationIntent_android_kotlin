package com.camoutech.navigationintent.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.camoutech.navigationintent.DetailsActivity
import com.camoutech.navigationintent.R
import com.camoutech.navigationintent.model.Word

class ExpressionAdapter(val expressions: List<Word>, val context: Context): RecyclerView.Adapter<ExpressionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpressionViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.expression_layout, parent, false)
        return ExpressionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpressionViewHolder, position: Int) {
        val expression = expressions[position]
        holder.button.text = expression.name
        holder.button.setOnClickListener {
            //Preparer notre Intent (passage vers une autre activity
            //1. Créer un Intent contexte + Destination
            val intent: Intent = Intent(context, DetailsActivity::class.java)
            //3. Démarrer la nouvelle activity
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return expressions.size
    }

}