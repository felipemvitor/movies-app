package br.com.felipe.movies.util

import android.util.Log

object Logger {

    private const val TAG = "FELIPE_MARTINS"

    fun logI(infoMessage: String) {
        Log.i(TAG, infoMessage)
    }

    fun logE(errorMessage: String) {
        Log.e(TAG, errorMessage)
    }
}