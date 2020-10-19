package tindall;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Scanner in = new Scanner(System.in);
        String key = "d7ffb76f27d5f75f6ce4b7817252176f";
        String inputLine="";
        List<String> cities = new ArrayList<>();

        //Get 1 Day forecast


        //Prompt for city
        for(int i = 0; i < 5; i++) {
            String oneDay = "http://api.openweathermap.org/data/2.5/weather?q=Rexburg&units=imperial&APPID=key";
            String fiveDay = "http://api.openweathermap.org/data/2.5/forecast?q=Rexburg&units=imperial&appid=key";
            //Put key in string
            oneDay = oneDay.replaceAll("key", key);
            fiveDay = fiveDay.replaceAll("key", key);

            // Prompt for city and replace it in string
            System.out.println("City: " + (i+1));
            System.out.println("What city are you looking for?: ");
            String city = in.nextLine();
            cities.add(city);
            URL url1 = new URL(oneDay.replaceAll("Rexburg", city));
            URL url5 = new URL(fiveDay.replaceAll("Rexburg", city));
/*
            //Search for 1 day forecast
            WeatherConditions weather;
            try {
                URLConnection connection = url1.openConnection();
                BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                inputLine = input.readLine();
                //System.out.println(inputLine);
                //Deserialize data
                Gson gson = new Gson();
                weather = gson.fromJson(inputLine, WeatherConditions.class);
                System.out.println("City: " + weather.getName() + ". Temp: " + weather.getMeasurements().get("temp"));
                System.out.println();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
*/
            //Search for 5 day forecast
            try {
                URLConnection connection = url5.openConnection();
                BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                inputLine = input.readLine();
                String ds = data.toString();
                //Deserialize data
                System.out.println(ds);
                Gson gson = new Gson();
                WeatherForecast wFore = gson.fromJson(ds, WeatherForecast.class);

                //Display data
                //System.out.println(inputLine);
                //wFore.breakUp();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
    }
}
