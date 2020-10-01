package tindall;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Scanner in = new Scanner(System.in);
        String key = "d7ffb76f27d5f75f6ce4b7817252176f";
        String inputLine="";

        //Get 1 Day forecast
        String oneDay = "http://api.openweathermap.org/data/2.5/weather?q=Rexburg&units=imperial&APPID=key";
        String fiveDay = "http://api.openweathermap.org/data/2.5/forecast?q=Rexburg&units=imperial&appid=key";

        //Put key in string
        oneDay = oneDay.replaceAll("key", key);
        fiveDay = fiveDay.replaceAll("key", key);

        //Prompt for city
        System.out.println("What city are you looking for?: ");
        String city = in.nextLine();
        URL url1 = new URL(oneDay.replaceAll("Rexburg", city));
        URL url5 = new URL(fiveDay.replaceAll("Rexburg", city));
        //Search for 1 day forecast
        WeatherForecast wFore = null;
        WeatherConditions weather =null;
        try {
            URLConnection connection = url1.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            inputLine = input.readLine();
            //Deserialize data
            Gson gson = new Gson();
            weather = gson.fromJson(inputLine, WeatherConditions.class);
        } catch (IOException ioException) {ioException.printStackTrace();}

        //Search for 5 day forecast
        try {
            URLConnection connection = url5.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            inputLine = input.readLine();
            //Deserialize data
            Gson gson = new Gson();
            wFore = gson.fromJson(inputLine, WeatherForecast.class);
        } catch (IOException ioException) {ioException.printStackTrace();}

        //Display data
        System.out.println(wFore);
    }
}
