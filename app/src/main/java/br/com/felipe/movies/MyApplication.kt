package br.com.felipe.movies

import android.app.Application
import br.com.felipe.movies.api.controller.configuration.ConfigurationController
import com.facebook.stetho.Stetho

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)

        ConfigurationController.getApiConfiguration()
        ConfigurationController.getCountries()
        ConfigurationController.getJobs()
        ConfigurationController.getLanguage()
        ConfigurationController.getPrimaryTranslations()
        ConfigurationController.getTimezones()
    }
}