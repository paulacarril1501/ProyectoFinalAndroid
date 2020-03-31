package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class acercadenosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercadenosotros);
        getSupportActionBar().setTitle("FAST FOOD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
