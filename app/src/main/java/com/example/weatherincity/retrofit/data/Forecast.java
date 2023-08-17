package com.example.weatherincity.retrofit.data;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("forecastday")
    @Expose
    private List<Forecastday> forecastday;

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Forecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("forecastday");
        sb.append('=');
        sb.append(((this.forecastday == null)?"<null>":this.forecastday));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.forecastday == null)? 0 :this.forecastday.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecast) == false) {
            return false;
        }
        Forecast rhs = ((Forecast) other);
        return ((this.forecastday == rhs.forecastday)||((this.forecastday!= null)&&this.forecastday.equals(rhs.forecastday)));
    }

}
