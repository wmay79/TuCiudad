package com.wmay.tuciudad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class ListSitiosActivity2 : AppCompatActivity() {

    private lateinit var ListSitios: ArrayList<Puntos>
    private lateinit var sitiosAdapter: SitiosAdapter
    private lateinit var List_sitios_recycler_view: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sitios2)

        List_sitios_recycler_view = findViewById(R.id.list_sitios_recycler_view)

     //   ListSitios = crearMockPuntos()
        ListSitios = loadMocksitiosFromJson()
        sitiosAdapter = SitiosAdapter(ListSitios)

        List_sitios_recycler_view.apply {
            layoutManager = LinearLayoutManager(context)        //conexion a internet
            adapter = sitiosAdapter
            setHasFixedSize(false)
        }

    }

    private fun loadMocksitiosFromJson(): ArrayList<Puntos> {

        var sitiosString: String = applicationContext.assets.open("sitios.json").bufferedReader().use {it.readText()}
        val gson = Gson()
        val data = gson.fromJson(sitiosString,Puntos::class.java)
    }

    private fun crearMockPuntos(): ArrayList<Puntos> { //Mock prueba internet


        return arrayListOf(
            Puntos(
                name = "Cristo Rey",
                score = "4.0",
                description = "Estatua de 26 metros de altura ubicada en el Cerro los Cristales a 1440 msnm en el corregimiento Los Andes, al occidente de la ciudad de Santiago de Cali",
                urlpictures = "https://chipviajero.com/wp-content/uploads/2018/10/Como-llegar-al-Cristo-Rey-Cali-Buga-Chip-Viajero-6.jpg"
            ),

            Puntos(
                name = "Zoológico de Cali",
                score = "4.5",
                description = "Cuenta con alrededor de 350 animales de 233 especies,1 entre anfibios (7%), mamíferos (21%), reptiles (12%), aves (30%), peces (21%) y mariposas (9%)",
                urlpictures = "https://www.kienyke.com/sites/default/files/2020-05/Zoologico-de-Cali.jpg"
            ),
            Puntos(
                name = "Museo la Tertulia",
                score = "4.0",
                description = "Es un museo de arte, el primero de arte moderno y con la colección de obras en soporte de papel más importante del país ",
                urlpictures = "https://upload.wikimedia.org/wikipedia/commons/b/b5/La_Tertulia_7-05-2015_06.JPG"
            ),
            Puntos(
                name = "Iglesia de la Ermita",
                score = "4.0",
                description = "Templo católico dedicada a Nuestra Señora de la Soledad y al Señor de la Caña",
                urlpictures = "https://www.ecured.cu/images/f/f7/Iglesia_La_Ermita_-_Cali.jpg"
            ),
            Puntos(
                name = "Capilla de San Antonio",
                score = "4.0",
                description = "Tipo barroco, se encuentra ubicada en la Colina de San Antonio en Santiago de Cali, Colombia",
                urlpictures = "https://www.ecured.cu/images/f/f7/Iglesia_La_Ermita_-_Cali.jpg"
            ),


            )
    }

}