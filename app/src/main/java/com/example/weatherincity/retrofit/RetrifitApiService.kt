package com.example.weatherincity.retrofit

import com.example.weatherincity.retrofit.data.WeatherData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

private const val WEATHER_URL ="https://api.weatherapi.com/v1/"

object RetrifitApiService {
    val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(WEATHER_URL)
        .build()

    fun weatherService(): WeatherApi = retrofit.create(WeatherApi::class.java)




}