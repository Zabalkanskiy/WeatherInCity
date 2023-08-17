package com.example.weatherincity

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Observer
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
                    val state = remember {
                        mutableStateOf<WeatherData?>(null)
                    }
                    val viewModelWeather:ViewModel = viewModel()
                    val weatherObserver = Observer<WeatherData> { weatherData ->
                        // Update the UI, in this case, a TextView.
                       state.value = weatherData

                    }

                    viewModelWeather.liveData.observe(this, weatherObserver)

                    Column() {
                        SearchText(viewModel = viewModelWeather)

                        if (state.value == null){

                        }else{
                            WeatherScreen(weatherData = state.value!!)
                        }
                    }




                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchText(viewModel: ViewModel){
    var state = remember { mutableStateOf("")  }
    OutlinedTextField(value = state.value,
        onValueChange = { value ->
            state.value = value
        textCitySearch(value, viewModel) },
        label = { Text(text = "enter city")},
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(color = Color.White, fontSize = 18.sp),
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "",
                modifier = Modifier
                    .padding(15.dp)
                    .size(24.dp)
            )
        },
        trailingIcon = {
            if (state.value != "") {
                IconButton(
                    onClick = {
                        state.value =
                            "" // Remove text from TextField when you press the 'X' icon
                    }
                ) {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(15.dp)
                            .size(24.dp)
                    )
                }
            }
        },
        singleLine = true,
        shape = RectangleShape, // The TextFiled has rounded corners top left and right by default
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.White,
            cursorColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )

    )



}

@Composable
fun WeatherScreen(weatherData: WeatherData){
    val viewModel:ViewModel = viewModel()
    //LaunchedEffect(key1 = "request_weather", block = {viewModel.getWeatherData("Moscow")} )
    LazyColumn(contentPadding = PaddingValues(vertical = 8.dp, horizontal = 8.dp)){
        // need add WeatherData

        items(weatherData.forecast.forecastday){
            item ->
            NewWeatherIcon(forecastDay = item, modifier = Modifier, weatherData = weatherData)
            Divider(color = Color.Blue, thickness = 1.dp)
        }





    }
}








fun textCitySearch(city: String, viewModel: ViewModel):Unit{
    if(city.length>2) {
        viewModel.getWeather(city = city)
    }
}


@Composable
fun NewWeatherIcon(forecastDay: Forecastday, modifier: Modifier, weatherData: WeatherData) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .fillMaxWidth()
        , horizontalArrangement = Arrangement.Center) {
        var textHttpWeather = "https:" + forecastDay.day.condition.icon
        Log.d("WEATHERICON", textHttpWeather)
        Image(painter = rememberAsyncImagePainter(textHttpWeather), contentDescription = "weather", modifier = Modifier.size(64.dp))
        Column {
            Row() {
                Text(text = "name: ", modifier = Modifier.alignByBaseline())
                Text(text = weatherData.location.name, modifier = Modifier.alignByBaseline(), fontSize = 18.sp )
            }

               // Spacer(modifier = Modifier.padding(3.dp))
                Text(text = "date ${forecastDay.date}")

            Text(text = "country ${weatherData.location.country}")



            Text(text = "${forecastDay.day.condition.text}")
            Text(text ="max temperature ${forecastDay.day.maxtempC.toString()}" )
            Text(text = "min temperature ${forecastDay.day.mintempC.toString()}")
        }

    }
}







