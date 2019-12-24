package br.com.felipe.movies.api

import br.com.felipe.movies.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitConfig {

    private val BASE_URL = "https://api.themoviedb.org/3/"

    private val interceptor = Interceptor { chain ->
        val request = chain.request()
        val url = request.url()

        val newUrl = url.newBuilder()
            .addQueryParameter("api_key", BuildConfig.API_KEY)
            .build()

        val newRequest = request.newBuilder()
            .url(newUrl)

        chain.proceed(newRequest.build())
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(getClient())
        .addConverterFactory(GsonConverterFactory.create())

    private fun getClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }

    fun <S> createService(service: Class<S>): S {
        return retrofit.build().create(service)
    }
}