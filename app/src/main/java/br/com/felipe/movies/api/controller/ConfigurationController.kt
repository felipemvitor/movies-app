package br.com.felipe.movies.api.controller

import br.com.felipe.movies.api.RetrofitConfig
import br.com.felipe.movies.api.entities.configuration.*
import br.com.felipe.movies.api.services.ConfigurationService
import br.com.felipe.movies.util.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ConfigurationController {

    private var service = RetrofitConfig.createService(ConfigurationService::class.java)

    fun getApiConfiguration() {
        val call = service.getApiConfiguration()

        call.enqueue(object : Callback<Configuration> {
            override fun onFailure(call: Call<Configuration>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(call: Call<Configuration>, response: Response<Configuration>) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun getCountries() {
        val call = service.getCountries()

        call.enqueue(object : Callback<ArrayList<Country>> {
            override fun onFailure(call: Call<ArrayList<Country>>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(
                call: Call<ArrayList<Country>>,
                response: Response<ArrayList<Country>>
            ) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun getJobs() {
        val call = service.getJobs()

        call.enqueue(object : Callback<ArrayList<Job>> {
            override fun onFailure(call: Call<ArrayList<Job>>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(
                call: Call<ArrayList<Job>>,
                response: Response<ArrayList<Job>>
            ) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun getLanguage() {
        val call = service.getLanguages()

        call.enqueue(object : Callback<ArrayList<Language>> {
            override fun onFailure(call: Call<ArrayList<Language>>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(
                call: Call<ArrayList<Language>>,
                response: Response<ArrayList<Language>>
            ) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun getPrimaryTranslations() {
        val call = service.getPrimaryTranslations()

        call.enqueue(object : Callback<ArrayList<String>> {
            override fun onFailure(call: Call<ArrayList<String>>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(
                call: Call<ArrayList<String>>,
                response: Response<ArrayList<String>>
            ) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }

    fun getTimezones() {
        val call = service.getTimezones()

        call.enqueue(object : Callback<ArrayList<Timezone>> {
            override fun onFailure(call: Call<ArrayList<Timezone>>, t: Throwable) {
                Logger.logE(t.message ?: "Erro")
            }

            override fun onResponse(
                call: Call<ArrayList<Timezone>>,
                response: Response<ArrayList<Timezone>>
            ) {
                if (response.isSuccessful) {
                    Logger.logI(response.body().toString())
                } else {
                    Logger.logE(response.errorBody().toString())
                }
            }
        })
    }
}