package com.wmay.tuciudad.model


import com.google.gson.annotations.SerializedName

data class PuntosItem(
    @SerializedName("description")
    val description: String,
    @SerializedName("link foto")
    val linkFoto: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("score")
    val score: String,
    @SerializedName("urlpictures")
    val urlpictures: String
)