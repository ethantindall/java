package com.example.wk6team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evenClick(View view) {
        EvenNumbers ev = new EvenNumbers();
        new Thread(ev).start();

        Context context = getApplicationContext();
        String text = "Even numbers counted!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        try {
            Thread.sleep(12500);
            toast.show();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void oddClick(View view) {
        OddNumbers o = new OddNumbers();
        new Thread(o).start();

        Context context = getApplicationContext();
        String text = "Odd numbers counted!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        try {
            Thread.sleep(12500);
            toast.show();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

