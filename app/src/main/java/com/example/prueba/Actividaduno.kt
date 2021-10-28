package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class Actividaduno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // btnIr.setOnClickListener {
          //  startActivity(Intent(this, Actividaddos::class.java))
        //}


        hbo.setOnClickListener {
            startActivity(Intent(this, Actividaddos::class.java))
        }



          hbo1.setOnClickListener {
              startActivity(Intent(this, tres::class.java))
          }



    }





}
