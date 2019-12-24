package br.com.felipe.movies.api.entities.configuration

import com.google.gson.annotations.SerializedName

class Timezone {

    @SerializedName("iso_3166_1")
    var iso: String? = ""

    var zones: ArrayList<String> = ArrayList()

    override fun toString(): String {
        return "Timezone(iso=$iso, zones=$zones)"
    }
}