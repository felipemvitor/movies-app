package br.com.felipe.movies.api.services

import br.com.felipe.movies.api.entities.authentication.AuthRequestBody
import br.com.felipe.movies.api.entities.authentication.AuthResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import java.io.Serializable

interface AuthService {

    @GET("authentication/guest_session/new")
    fun createGuestSession(): Call<AuthResponse>

    @GET("authentication/token/new")
    fun createRequestToken(): Call<AuthResponse>

    @POST("authentication/session/new")
    fun createSession(@Body requestBody: AuthRequestBody): Call<AuthResponse>

    @POST("authentication/token/validate_with_login")
    fun createSessionWithLogin(@Body authRequestBody: AuthRequestBody): Call<AuthResponse>

    @POST("authentication/session/convert/4")
    fun createSessionV4(): Call<AuthResponse>

    @DELETE("authentication/session")
    fun deleteSession(@Body authRequestBody: AuthRequestBody): Call<AuthResponse>

}