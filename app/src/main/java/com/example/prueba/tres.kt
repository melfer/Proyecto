package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actividaddos.*
import kotlinx.android.synthetic.main.activity_tres2.*

class tres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres2)
        button.setOnClickListener {
            startActivity(Intent(this, Actividaduno::class.java))

        }
    }

}