package com.example.weatherincity

import android.app.Application
import android.content.Context

class WeatherApplication : Application(){
    init {
        app = this
    }

    companion object {
        private lateinit var app : WeatherApplication

        fun getAppContext(): Context = app.applicationContext
    }
}