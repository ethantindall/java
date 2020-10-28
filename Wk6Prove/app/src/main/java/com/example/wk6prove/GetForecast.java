package com.example.wk6prove;

import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class GetForecast implements Runnable {
    public String city;
    private String baseUrl = "http://api.openweathermap.org/data/2.5/forecast?q=Rexburg&units=imperial&appid=key";
    private final String key = "d7ffb76f27d5f75f6ce4b7817252176f";
    private Gson gson;
    private WeatherForecast weather;


    GetForecast() {
    }

    ;

    @Override
    public void run() {
        String urls = baseUrl.replaceAll("key", key);
        try {
            URL url = new URL(urls.replaceAll("Rexburg", city));
            URLConnection connection = url.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine = input.readLine();
            //Deserialize data
            Gson gson = new Gson();
            weather = gson.fromJson(inputLine, WeatherForecast.class);
            Log.d("Alert", ("Getting forecast for: City- " + city + " - " + weather.getForecastItems()));


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<WeatherForecastItem> retrieveForecast() {
        return weather.getForecastItems();
    }
}
