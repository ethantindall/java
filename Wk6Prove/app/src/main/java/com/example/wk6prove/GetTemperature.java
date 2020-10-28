package com.example.wk6prove;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class GetTemperature implements Runnable {
    private final String key = "d7ffb76f27d5f75f6ce4b7817252176f";
    private final String baseUrl = "http://api.openweathermap.org/data/2.5/weather?q=Rexburg&units=imperial&APPID=key";
    private Gson gson;
    public String city;
    public String temp;

    GetTemperature() {
    };

    @Override
    public void run() {
        String urls = baseUrl.replaceAll("key", key);
        WeatherConditions weather;
        try {
            URL url = new URL(urls.replaceAll("Rexburg", city));
            URLConnection connection = url.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine = input.readLine();
            //Deserialize data
            Gson gson = new Gson();
            weather = gson.fromJson(inputLine, WeatherConditions.class);
            Log.d("Alert", ("Getting temperature for: " + weather.getName() + ". Temp: " + weather.getMeasurements().get("temp")));
            temp = "City: " + weather.getName() + ". Temp: " + weather.getMeasurements().get("temp");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
    public String returnTemp() {
        return temp;
    }

}
