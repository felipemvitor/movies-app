package br.com.felipe.movies.api.entities.configuration

import com.google.gson.annotations.SerializedName

class Country {

    @SerializedName("iso_3166_1")
    var iso: String? = ""

    @SerializedName("english_name")
    var englishName: String? = ""

    override fun toString(): String {
        return "Country(iso=$iso, englishName=$englishName)"
    }
}