package com.wmay.tuciudad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class RegistroCiudadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_ciudad)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_editTextTextPersonName)
        val infoTextView: TextView = findViewById(R.id.info_text_View)
        val puntuacionEditText: TextInputEditText = findViewById(R.id.puntuacion_edit_text)

        registrarButton.setOnClickListener {
            val nombre : String= nombreEditText.text.toString()
            val puntuacion : Float = puntuacionEditText.text.toString().toFloat()
            infoTextView.text = getString(R.string.nombre_info, nombre, puntuacion)

        }

    }
}