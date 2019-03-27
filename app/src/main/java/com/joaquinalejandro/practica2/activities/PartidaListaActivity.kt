package com.joaquinalejandro.practica2.activities


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.joaquinalejandro.practica2.*

import kotlinx.android.synthetic.main.fragment_lista_fragment.*


class PartidaListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida_lista)

        val fm = supportFragmentManager
        if (fm.findFragmentById(R.id.fragment_container) == null) {
            fm.executeTransaction { add(R.id.fragment_container, lista_fragment()) }
        }

    }

}