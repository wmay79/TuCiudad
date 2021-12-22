package com.wmay.tuciudad.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import com.wmay.tuciudad.R
import com.wmay.tuciudad.databinding.ActivityDetalleBinding
import com.wmay.tuciudad.model.PuntosItem

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
       setContentView(detalleBinding.root)

        val puntos = PuntosItem = intent.extras?getSerializable("puntos") as PuntosItem
        detalleBinding.mainTextView.text = PuntosItem


    }
}
