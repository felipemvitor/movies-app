package br.com.felipe.movies.api.services.configuration

import br.com.felipe.movies.api.entities.configuration.*
import retrofit2.Call
import retrofit2.http.GET

interface ConfigurationService {

    @GET("configuration")
    fun getApiConfiguration(): Call<Configuration>

    @GET("configuration/countries")
    fun getCountries(): Call<ArrayList<Country>>

    @GET("configuration/jobs")
    fun getJobs(): Call<ArrayList<Job>>

    @GET("configuration/languages")
    fun getLanguages(): Call<ArrayList<Language>>

    @GET("configuration/primary_translations")
    fun getPrimaryTranslations(): Call<ArrayList<String>>

    @GET("configuration/timezones")
    fun getTimezones(): Call<ArrayList<Timezone>>

}