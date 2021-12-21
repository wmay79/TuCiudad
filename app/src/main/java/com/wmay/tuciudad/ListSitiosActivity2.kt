package com.wmay.tuciudad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class ListSitiosActivity2 : AppCompatActivity() {

    private lateinit var ListSitios: ArrayList<Puntos>
    private lateinit var sitiosAdapter: SitiosAdapter
    private lateinit var List_sitios_recycler_view: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sitios2)

        List_sitios_recycler_view = findViewById(R.id.list_sitios_recycler_view)

        ListSitios = crearMockPuntos()

        sitiosAdapter = SitiosAdapter(ListSitios)

        List_sitios_recycler_view.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        List_sitios_recycler_view.adapter = sitiosAdapter

    }

    private fun crearMockPuntos(): ArrayList<Puntos> {


        return arrayListOf(
            Puntos(
                name = "Cristo Rey",
                score = "4.0",
                description = "Estatua de 26 metros de altura ubicada en el Cerro los Cristales a 1440 msnm en el corregimiento Los Andes, al occidente de la ciudad de Santiago de Cali"
            ),

            Puntos(
                name = "Zoológico de Cali",
                score = "4.5",
                description = "Cuenta con alrededor de 350 animales de 233 especies,1 entre anfibios (7%), mamíferos (21%), reptiles (12%), aves (30%), peces (21%) y mariposas (9%)"
            ),
            Puntos(
                name = "Museo la Tertulia",
                score = "4.0",
                description = "Es un museo de arte, el primero de arte moderno y con la colección de obras en soporte de papel más importante del país "
            ),
            Puntos(
                name = "Iglesia de la Ermita",
                score = "4.0",
                description = "Templo católico dedicada a Nuestra Señora de la Soledad y al Señor de la Caña"
            ),
            Puntos(
                name = "Capilla de San Antonio",
                score = "4.0",
                description = "Tipo barroco, se encuentra ubicada en la Colina de San Antonio en Santiago de Cali, Colombia"
            ),


            )
    }

}