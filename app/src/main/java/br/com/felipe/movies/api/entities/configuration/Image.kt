package br.com.felipe.movies.api.entities.configuration

import com.google.gson.annotations.SerializedName

class Image {

    @SerializedName("base_url")
    var baseUrl: String? = ""

    @SerializedName("secure_base_url")
    var secureBaseUrl: String? = ""

    @SerializedName("backdrop_sizes")
    var backdropSizes: ArrayList<String>? = ArrayList()

    @SerializedName("logo_sizes")
    var logoSizes: ArrayList<String>? = ArrayList()

    @SerializedName("poster_sizes")
    var posterSizes: ArrayList<String>? = ArrayList()

    @SerializedName("profile_sizes")
    var profileSizes: ArrayList<String>? = ArrayList()

    @SerializedName("still_sizes")
    var stillSizes: ArrayList<String>? = ArrayList()

    override fun toString(): String {
        return "Image(baseUrl=$baseUrl, secureBaseUrl=$secureBaseUrl, backdropSizes=$backdropSizes, logoSizes=$logoSizes, posterSizes=$posterSizes, profileSizes=$profileSizes, stillSizes=$stillSizes)"
    }
}