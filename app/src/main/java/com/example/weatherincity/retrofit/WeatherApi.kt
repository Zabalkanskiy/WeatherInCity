package com.example.weatherincity.retrofit

import com.example.weatherincity.retrofit.data.WeatherData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json?days=5&key=07ffa400e8cb41f1b6b111917231408")
    suspend fun getWeather(@Query("q") city :String): WeatherData
}