package br.com.felipe.movies.api.entities.configuration

import com.google.gson.annotations.SerializedName

class Configuration {

    var images: Image? = null

    @SerializedName("change_keys")
    var changeKeys: ArrayList<String>? = ArrayList()

    override fun toString(): String {
        return "Configuration(images=$images, changeKeys=$changeKeys)"
    }
}