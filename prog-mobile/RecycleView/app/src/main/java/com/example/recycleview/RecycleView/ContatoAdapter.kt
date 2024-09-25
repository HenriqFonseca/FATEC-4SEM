package com.example.recycleview.RecycleView

import Contato
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R

class ContatoAdapter(val contexto : Context, val lista : List<Contato>) : RecyclerView.Adapter<ContatoViewHolder>() {
    lateinit var inflater: LayoutInflater
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        inflater = LayoutInflater.from(contexto)
        val view = inflater.inflate(R.layout.contato_item_layout,parent,false)
        ContatoViewHolder(view)
        return ContatoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = lista[position]
        holder.txtNome.text = contato.nome
        holder.txtEmail.text = contato.email
        holder.txtTel.text = contato.telefone

    }

}