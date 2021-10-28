package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_actividaddos.*
import kotlinx.android.synthetic.main.activity_main.*

class Actividaddos : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividaddos)
        btnIr2.setOnClickListener {
            startActivity(Intent(this, Actividaduno::class.java))

        }
    }

    override fun onClick(v: View?) {
        //startActivity(Intent(this, Actividaduno::class.java))
    }




}