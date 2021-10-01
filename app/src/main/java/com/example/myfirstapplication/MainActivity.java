package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Throwable throwable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "My first Application layout is complete");
        Log.d("MainActivity", "Welcome!");
        Log.w("MainActivity", "Warning!");
      /*  Log.e("MainActivity", "Il s'agit d'une exception java",throwable.fillInStackTrace());*/
    }
}