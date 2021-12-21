package com.wmay.tuciudad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SitiosAdapter(
    private val sitiosList: ArrayList<Puntos>
) : RecyclerView.Adapter<SitiosAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_sitio_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val puntos = sitiosList[position]
        holder.bind(puntos)
    }

    override fun getItemCount(): Int = sitiosList.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var nameTextView: TextView = itemView.findViewById(R.id.name_textView)
        private var scoreTextView: TextView = itemView.findViewById(R.id.score_textView)
        private var descriptionTextView: TextView = itemView.findViewById(R.id.description_textView)
        private var pictureTextView: ImageView = itemView.findViewById(R.id.picture_imageView)

        fun bind(puntos: Puntos) {
            nameTextView.text = puntos.name
            scoreTextView.text = puntos.score
            descriptionTextView.text = puntos.description
            //picture

        }
    }

}