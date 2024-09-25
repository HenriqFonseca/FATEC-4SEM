package com.example.recycleview.activity

import Contato
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.RecycleView.ContatoAdapter


class ContatoListaActivity : Activity(){

    val lista = ArrayList<Contato>()
    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        setContentView(R.layout.contato_lista_activity)

        lista.add(Contato("Joao Silva", "Telefone1", "jooao@gmail.com"))
        lista.add(Contato("Maria", "Telefone2", "maraao@gmail.com"))
        lista.add(Contato("fernanda", "Telefone3", "fe@gmail.com"))

        val adapter = ContatoAdapter(this, lista)
        val recycler = findViewById<RecyclerView>(R.id.rcv_contato_lista)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
    }
}