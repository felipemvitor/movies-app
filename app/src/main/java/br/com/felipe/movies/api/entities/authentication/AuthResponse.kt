package br.com.felipe.movies.api.entities.authentication

import com.google.gson.annotations.SerializedName

class AuthResponse {

    var success: Boolean = false

    @SerializedName("expires_at")
    var expiresAt: String? = ""

    @SerializedName("request_token")
    var requestToken: String? = ""

    @SerializedName("guest_session_id")
    var guestSessionId: String? = ""

    @SerializedName("session_id")
    var sessionId: String? = ""

    override fun toString(): String {
        return "AuthResponse(success=$success, expiresAt=$expiresAt, requestToken=$requestToken, guestSessionId=$guestSessionId, sessionId=$sessionId)"
    }
}