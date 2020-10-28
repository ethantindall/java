package com.example.wk6prove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void temp(View view) {
        EditText city = (EditText) findViewById(R.id.citybox);
        GetTemperature temper = new GetTemperature();
        temper.city = city.getText().toString();
        new Thread(temper).start();


        ListView listview = (ListView) findViewById(R.id.listview);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //TOAST
        Context context = getApplicationContext();
        CharSequence text = (temper.returnTemp());
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        String[] values = new String[] {temper.returnTemp()};
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {list.add(values[i]);}
        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);


    }


    public void fore(View view) {
        EditText city = (EditText) findViewById(R.id.citybox);
        GetForecast fore = new GetForecast();
        fore.city = city.getText().toString();
        new Thread(fore).start();
        //TOAST
        Context context = getApplicationContext();
        CharSequence text = "Data Retrieved";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ListView listview = (ListView) findViewById(R.id.listview);

        String[] values = new String[] {};
        List<WeatherForecastItem> fores = fore.retrieveForecast();

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < fores.size(); ++i) {list.add(String.valueOf(fores.get(i)));}
        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

    }
}