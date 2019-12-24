package br.com.felipe.movies.api.entities.configuration

import com.google.gson.annotations.SerializedName

class Language {

    @SerializedName("iso_639_1")
    var iso: String? = ""

    @SerializedName("english_name")
    var englishName: String? = ""

    var name: String? = ""

    override fun toString(): String {
        return "Language(iso=$iso, englishName=$englishName, name=$name)"
    }
}