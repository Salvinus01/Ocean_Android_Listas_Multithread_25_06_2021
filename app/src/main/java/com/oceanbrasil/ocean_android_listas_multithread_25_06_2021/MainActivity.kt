package com.oceanbrasil.ocean_android_listas_multithread_25_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Cada lista precisa de um adapter
        //LayoutManager existe para estruturar a lista

        val rvLista = findViewById<RecyclerView>(R.id.rvLista)
        rvLista.layoutManager = LinearLayoutManager(this)

    }
}