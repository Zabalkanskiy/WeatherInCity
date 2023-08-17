package com.example.weatherincity.retrofit.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {

    @SerializedName("maxtemp_c")
    @Expose
    private Double maxtempC;
    @SerializedName("maxtemp_f")
    @Expose
    private Double maxtempF;
    @SerializedName("mintemp_c")
    @Expose
    private Double mintempC;
    @SerializedName("mintemp_f")
    @Expose
    private Double mintempF;
    @SerializedName("avgtemp_c")
    @Expose
    private Double avgtempC;
    @SerializedName("avgtemp_f")
    @Expose
    private Double avgtempF;
    @SerializedName("maxwind_mph")
    @Expose
    private Double maxwindMph;
    @SerializedName("maxwind_kph")
    @Expose
    private Double maxwindKph;
    @SerializedName("totalprecip_mm")
    @Expose
    private Double totalprecipMm;
    @SerializedName("totalprecip_in")
    @Expose
    private Double totalprecipIn;
    @SerializedName("totalsnow_cm")
    @Expose
    private Double totalsnowCm;
    @SerializedName("avgvis_km")
    @Expose
    private Double avgvisKm;
    @SerializedName("avgvis_miles")
    @Expose
    private Double avgvisMiles;
    @SerializedName("avghumidity")
    @Expose
    private Double avghumidity;
    @SerializedName("daily_will_it_rain")
    @Expose
    private Integer dailyWillItRain;
    @SerializedName("daily_chance_of_rain")
    @Expose
    private Integer dailyChanceOfRain;
    @SerializedName("daily_will_it_snow")
    @Expose
    private Integer dailyWillItSnow;
    @SerializedName("daily_chance_of_snow")
    @Expose
    private Integer dailyChanceOfSnow;
    @SerializedName("condition")
    @Expose
    private Condition__1 condition;
    @SerializedName("uv")
    @Expose
    private Double uv;

    public Double getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(Double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public Double getMaxtempF() {
        return maxtempF;
    }

    public void setMaxtempF(Double maxtempF) {
        this.maxtempF = maxtempF;
    }

    public Double getMintempC() {
        return mintempC;
    }

    public void setMintempC(Double mintempC) {
        this.mintempC = mintempC;
    }

    public Double getMintempF() {
        return mintempF;
    }

    public void setMintempF(Double mintempF) {
        this.mintempF = mintempF;
    }

    public Double getAvgtempC() {
        return avgtempC;
    }

    public void setAvgtempC(Double avgtempC) {
        this.avgtempC = avgtempC;
    }

    public Double getAvgtempF() {
        return avgtempF;
    }

    public void setAvgtempF(Double avgtempF) {
        this.avgtempF = avgtempF;
    }

    public Double getMaxwindMph() {
        return maxwindMph;
    }

    public void setMaxwindMph(Double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    public Double getMaxwindKph() {
        return maxwindKph;
    }

    public void setMaxwindKph(Double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public Double getTotalprecipMm() {
        return totalprecipMm;
    }

    public void setTotalprecipMm(Double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    public Double getTotalprecipIn() {
        return totalprecipIn;
    }

    public void setTotalprecipIn(Double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    public Double getTotalsnowCm() {
        return totalsnowCm;
    }

    public void setTotalsnowCm(Double totalsnowCm) {
        this.totalsnowCm = totalsnowCm;
    }

    public Double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(Double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public Double getAvgvisMiles() {
        return avgvisMiles;
    }

    public void setAvgvisMiles(Double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    public Double getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(Double avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Integer getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(Integer dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public Integer getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public Integer getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(Integer dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public Integer getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public Condition__1 getCondition() {
        return condition;
    }

    public void setCondition(Condition__1 condition) {
        this.condition = condition;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Day.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxtempC");
        sb.append('=');
        sb.append(((this.maxtempC == null)?"<null>":this.maxtempC));
        sb.append(',');
        sb.append("maxtempF");
        sb.append('=');
        sb.append(((this.maxtempF == null)?"<null>":this.maxtempF));
        sb.append(',');
        sb.append("mintempC");
        sb.append('=');
        sb.append(((this.mintempC == null)?"<null>":this.mintempC));
        sb.append(',');
        sb.append("mintempF");
        sb.append('=');
        sb.append(((this.mintempF == null)?"<null>":this.mintempF));
        sb.append(',');
        sb.append("avgtempC");
        sb.append('=');
        sb.append(((this.avgtempC == null)?"<null>":this.avgtempC));
        sb.append(',');
        sb.append("avgtempF");
        sb.append('=');
        sb.append(((this.avgtempF == null)?"<null>":this.avgtempF));
        sb.append(',');
        sb.append("maxwindMph");
        sb.append('=');
        sb.append(((this.maxwindMph == null)?"<null>":this.maxwindMph));
        sb.append(',');
        sb.append("maxwindKph");
        sb.append('=');
        sb.append(((this.maxwindKph == null)?"<null>":this.maxwindKph));
        sb.append(',');
        sb.append("totalprecipMm");
        sb.append('=');
        sb.append(((this.totalprecipMm == null)?"<null>":this.totalprecipMm));
        sb.append(',');
        sb.append("totalprecipIn");
        sb.append('=');
        sb.append(((this.totalprecipIn == null)?"<null>":this.totalprecipIn));
        sb.append(',');
        sb.append("totalsnowCm");
        sb.append('=');
        sb.append(((this.totalsnowCm == null)?"<null>":this.totalsnowCm));
        sb.append(',');
        sb.append("avgvisKm");
        sb.append('=');
        sb.append(((this.avgvisKm == null)?"<null>":this.avgvisKm));
        sb.append(',');
        sb.append("avgvisMiles");
        sb.append('=');
        sb.append(((this.avgvisMiles == null)?"<null>":this.avgvisMiles));
        sb.append(',');
        sb.append("avghumidity");
        sb.append('=');
        sb.append(((this.avghumidity == null)?"<null>":this.avghumidity));
        sb.append(',');
        sb.append("dailyWillItRain");
        sb.append('=');
        sb.append(((this.dailyWillItRain == null)?"<null>":this.dailyWillItRain));
        sb.append(',');
        sb.append("dailyChanceOfRain");
        sb.append('=');
        sb.append(((this.dailyChanceOfRain == null)?"<null>":this.dailyChanceOfRain));
        sb.append(',');
        sb.append("dailyWillItSnow");
        sb.append('=');
        sb.append(((this.dailyWillItSnow == null)?"<null>":this.dailyWillItSnow));
        sb.append(',');
        sb.append("dailyChanceOfSnow");
        sb.append('=');
        sb.append(((this.dailyChanceOfSnow == null)?"<null>":this.dailyChanceOfSnow));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("uv");
        sb.append('=');
        sb.append(((this.uv == null)?"<null>":this.uv));
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
        result = ((result* 31)+((this.uv == null)? 0 :this.uv.hashCode()));
        result = ((result* 31)+((this.dailyWillItRain == null)? 0 :this.dailyWillItRain.hashCode()));
        result = ((result* 31)+((this.dailyChanceOfRain == null)? 0 :this.dailyChanceOfRain.hashCode()));
        result = ((result* 31)+((this.avgtempF == null)? 0 :this.avgtempF.hashCode()));
        result = ((result* 31)+((this.mintempC == null)? 0 :this.mintempC.hashCode()));
        result = ((result* 31)+((this.totalprecipMm == null)? 0 :this.totalprecipMm.hashCode()));
        result = ((result* 31)+((this.dailyWillItSnow == null)? 0 :this.dailyWillItSnow.hashCode()));
        result = ((result* 31)+((this.totalprecipIn == null)? 0 :this.totalprecipIn.hashCode()));
        result = ((result* 31)+((this.avghumidity == null)? 0 :this.avghumidity.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.avgvisKm == null)? 0 :this.avgvisKm.hashCode()));
        result = ((result* 31)+((this.mintempF == null)? 0 :this.mintempF.hashCode()));
        result = ((result* 31)+((this.maxwindMph == null)? 0 :this.maxwindMph.hashCode()));
        result = ((result* 31)+((this.maxwindKph == null)? 0 :this.maxwindKph.hashCode()));
        result = ((result* 31)+((this.maxtempF == null)? 0 :this.maxtempF.hashCode()));
        result = ((result* 31)+((this.dailyChanceOfSnow == null)? 0 :this.dailyChanceOfSnow.hashCode()));
        result = ((result* 31)+((this.avgtempC == null)? 0 :this.avgtempC.hashCode()));
        result = ((result* 31)+((this.totalsnowCm == null)? 0 :this.totalsnowCm.hashCode()));
        result = ((result* 31)+((this.maxtempC == null)? 0 :this.maxtempC.hashCode()));
        result = ((result* 31)+((this.avgvisMiles == null)? 0 :this.avgvisMiles.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Day) == false) {
            return false;
        }
        Day rhs = ((Day) other);
        return (((((((((((((((((((((this.uv == rhs.uv)||((this.uv!= null)&&this.uv.equals(rhs.uv)))&&((this.dailyWillItRain == rhs.dailyWillItRain)||((this.dailyWillItRain!= null)&&this.dailyWillItRain.equals(rhs.dailyWillItRain))))&&((this.dailyChanceOfRain == rhs.dailyChanceOfRain)||((this.dailyChanceOfRain!= null)&&this.dailyChanceOfRain.equals(rhs.dailyChanceOfRain))))&&((this.avgtempF == rhs.avgtempF)||((this.avgtempF!= null)&&this.avgtempF.equals(rhs.avgtempF))))&&((this.mintempC == rhs.mintempC)||((this.mintempC!= null)&&this.mintempC.equals(rhs.mintempC))))&&((this.totalprecipMm == rhs.totalprecipMm)||((this.totalprecipMm!= null)&&this.totalprecipMm.equals(rhs.totalprecipMm))))&&((this.dailyWillItSnow == rhs.dailyWillItSnow)||((this.dailyWillItSnow!= null)&&this.dailyWillItSnow.equals(rhs.dailyWillItSnow))))&&((this.totalprecipIn == rhs.totalprecipIn)||((this.totalprecipIn!= null)&&this.totalprecipIn.equals(rhs.totalprecipIn))))&&((this.avghumidity == rhs.avghumidity)||((this.avghumidity!= null)&&this.avghumidity.equals(rhs.avghumidity))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.avgvisKm == rhs.avgvisKm)||((this.avgvisKm!= null)&&this.avgvisKm.equals(rhs.avgvisKm))))&&((this.mintempF == rhs.mintempF)||((this.mintempF!= null)&&this.mintempF.equals(rhs.mintempF))))&&((this.maxwindMph == rhs.maxwindMph)||((this.maxwindMph!= null)&&this.maxwindMph.equals(rhs.maxwindMph))))&&((this.maxwindKph == rhs.maxwindKph)||((this.maxwindKph!= null)&&this.maxwindKph.equals(rhs.maxwindKph))))&&((this.maxtempF == rhs.maxtempF)||((this.maxtempF!= null)&&this.maxtempF.equals(rhs.maxtempF))))&&((this.dailyChanceOfSnow == rhs.dailyChanceOfSnow)||((this.dailyChanceOfSnow!= null)&&this.dailyChanceOfSnow.equals(rhs.dailyChanceOfSnow))))&&((this.avgtempC == rhs.avgtempC)||((this.avgtempC!= null)&&this.avgtempC.equals(rhs.avgtempC))))&&((this.totalsnowCm == rhs.totalsnowCm)||((this.totalsnowCm!= null)&&this.totalsnowCm.equals(rhs.totalsnowCm))))&&((this.maxtempC == rhs.maxtempC)||((this.maxtempC!= null)&&this.maxtempC.equals(rhs.maxtempC))))&&((this.avgvisMiles == rhs.avgvisMiles)||((this.avgvisMiles!= null)&&this.avgvisMiles.equals(rhs.avgvisMiles))));
    }

}
