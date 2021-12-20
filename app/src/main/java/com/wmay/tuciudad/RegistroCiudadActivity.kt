package com.wmay.tuciudad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistroCiudadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_ciudad)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_editTextTextPersonName)
        val infoTextView: TextView = findViewById(R.id.info_text_View)

        registrarButton.setOnClickListener {
            val nombre = nombreEditText.text
            infoTextView.text = nombre

        }

    }
}