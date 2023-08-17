package com.example.weatherincity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.example.weatherincity.model.ViewModel
import com.example.weatherincity.retrofit.data.Day
import com.example.weatherincity.retrofit.data.Forecastday
import com.example.weatherincity.retrofit.data.WeatherData
import com.example.weatherincity.ui.theme.WeatherInCityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherInCityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModelWeather:ViewModel = viewModel()
                    SearchText(viewModel = viewModelWeather)

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchText(viewModel: ViewModel){
    var state = remember { mutableStateOf("")  }
    OutlinedTextField(value = state.value, onValueChange = {value -> state.value = value
        textCitySearch(value, viewModel) }, label = { Text(text = "enter city")})


}

@Composable
fun WeatherScreen(weatherData: WeatherData){
    val viewModel:ViewModel = viewModel()
    //LaunchedEffect(key1 = "request_weather", block = {viewModel.getWeatherData("Moscow")} )
    LazyColumn(contentPadding = PaddingValues(vertical = 8.dp, horizontal = 8.dp)){
        // need add WeatherData
        items(weatherData.forecast.forecastday){
            item ->
            WeatherItem(item)

        }





    }
}
@Composable
fun WeatherItem( forecastday: Forecastday){
    Card(elevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp
    ), modifier = Modifier
        .padding(8.dp)
        .clickable { }){
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp) ){
            InformationWeather(forecastday.date, forecastday.day)
            IconWeather(forecastday.day)

        }
    }
}

@Composable
fun InformationWeather(date: String?, day: Day?) {
    Column() {
        Text(text = date ?: "No information") }
        Text(text = day?.condition?.text ?:"No information")
        Row() {
            Text(text = day?.mintempC.toString())
            Text(text = day?.maxtempC.toString())
        }

    }




@Composable
fun IconWeather(day: Day) {
    //day.condition.text
   // "//cdn.weatherapi.com/weather/64x64/day/176.png"
    Image(painter = rememberAsyncImagePainter(day.condition.icon.startsWith(startIndex = 2, prefix = "http://")), contentDescription = "weather")

}




    fun textCitySearch(city: String, viewModel: ViewModel):Unit{
    if(city.length>2) {
        viewModel.retrofit.loadingWeatherData(city = city)
    }
}


