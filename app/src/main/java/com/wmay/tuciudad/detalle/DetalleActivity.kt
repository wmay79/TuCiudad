package com.wmay.tuciudad.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import com.wmay.tuciudad.R
import com.wmay.tuciudad.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)


        val nombre = intent.extras?.getString("nombre")
        detalleBinding.mainTextView.text = nombre


    }
}