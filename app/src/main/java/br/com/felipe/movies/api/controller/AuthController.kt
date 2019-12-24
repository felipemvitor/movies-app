package br.com.felipe.movies.api.controller

import br.com.felipe.movies.api.RetrofitConfig
import br.com.felipe.movies.api.entities.authentication.AuthRequestBody
import br.com.felipe.movies.api.entities.authentication.AuthResponse
import br.com.felipe.movies.api.services.AuthService
import br.com.felipe.movies.util.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.Serializable

object AuthController {

    private var service = RetrofitConfig.createService(AuthService::class.java)

    fun createGuestSession() {
        val call = service.createGuestSession()

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun createRequestToken() {
        val call = service.createRequestToken()

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun createSession(requestToken: String) {
        val body = AuthRequestBody().apply {
            this.requestToken = requestToken
        }
        val call = service.createSession(body)

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun createSessionWithLogin(username: String, password: String, requestToken: String) {
        val body = AuthRequestBody().apply {
            this.username = username
            this.password = password
            this.requestToken = requestToken
        }
        val call = service.createSessionWithLogin(body)

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun createSessionV4() {
        val call = service.createSessionV4()

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun deleteSession(sessionId: String) {
        var body = AuthRequestBody().apply {
            this.sessionId = sessionId
        }
        val call = service.deleteSession(body)

        call.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }
}