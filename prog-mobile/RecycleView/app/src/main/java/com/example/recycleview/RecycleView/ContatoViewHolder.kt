package com.example.recycleview.RecycleView

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R

class ContatoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    var txtNome : TextView = itemView.findViewById(R.id.txtItemNome)
    var txtEmail : TextView = itemView.findViewById(R.id.txtItemEmail)
    var txtTel : TextView = itemView.findViewById(R.id.txtItemTel)
}