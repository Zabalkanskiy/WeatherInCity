package com.example.weatherincity.model

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherincity.retrofit.RetrifitApiService
import com.example.weatherincity.retrofit.data.Forecastday
import com.example.weatherincity.retrofit.data.WeatherData
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModel : ViewModel(){

    val state = mutableStateOf<WeatherData?>(null)
    val mutableLiveData = MutableLiveData<WeatherData>()
    val liveData: LiveData<WeatherData> = mutableLiveData

    private  val  errorHandler = CoroutineExceptionHandler { _, exeption ->
        exeption.printStackTrace()
    }

    fun getWeather(city: String){
        viewModelScope.launch(Dispatchers.IO + errorHandler) {
            val weatherData = RetrifitApiService.weatherService().getWeather(city)
            withContext(Dispatchers.Main){
               // state.value = weatherData
                mutableLiveData.postValue(weatherData)
            }
        }
    }
    val retrofit = RetrifitApiService




}