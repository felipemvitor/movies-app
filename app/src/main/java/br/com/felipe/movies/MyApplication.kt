package br.com.felipe.movies

import android.app.Application
import br.com.felipe.movies.api.controller.AuthController
import br.com.felipe.movies.api.controller.ConfigurationController
import com.facebook.stetho.Stetho

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}