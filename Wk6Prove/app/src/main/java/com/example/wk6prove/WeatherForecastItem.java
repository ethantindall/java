package com.example.wk6prove;
import java.util.Map;
/*
public class WeatherForecastItem {
    private int dt;
    private Map<String, Float> main;
    private Map<String, String> weather;
    private String dt_txt;




    public Map<String, Float> getMain() {
        return main;
    }

    public void setMain(Map<String, Float> main) {
        this.main = main;
    }

    public Map<String, String> getWeather() {
        return weather;
    }

    public void setWeather(Map<String, String> weather) {
        this.weather = weather;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }
}
*/
//---------------------------

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecastItem {
@SerializedName("dt_txt")
private String time;
@SerializedName("main")
private Map<String,Float> measurements;
@SerializedName("weather")
private List<WeatherDescription> weatherList;
private WeatherWind wind;

public String getTime() { return time; }
public Map<String, Float> getMeasurements() { return measurements; }
public List<WeatherDescription> getWeather() { return weatherList; }
public WeatherWind getWind() { return wind; }

public String toString() {
   return "Time: " + time +
         " Temp: " + measurements.get("temp_max") + " / " + measurements.get("temp_min") +
      " Weather: " + weatherList.get(0).getDescription() +
            " Wind: " + wind.getSpeed();
}
 }