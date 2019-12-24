package br.com.felipe.movies.api.entities.authentication

import com.google.gson.annotations.SerializedName

class AuthRequestBody {

    var username: String? = ""

    var password: String? = ""

    @SerializedName("request_token")
    var requestToken: String? = ""

    @SerializedName("access_token")
    var accessToken: String? = ""

    @SerializedName("session_id")
    var sessionId: String = ""
}