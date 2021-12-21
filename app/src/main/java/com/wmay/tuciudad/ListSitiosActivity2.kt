package com.wmay.tuciudad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class ListSitiosActivity2 : AppCompatActivity() {

    private lateinit var ListSitios: ArrayList<Puntos>
    private lateinit var sitiosAdapter: SitiosAdapter
    private lateinit var List_sitios_recycler_view: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sitios2)

        List_sitios_recycler_view =findViewById(R.id.list_sitios_recycler_view)

        sitiosAdapter = SitiosAdapter()

        List_sitios_recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        List_sitios_recycler_view.adapter = sitiosAdapter

    }

}