package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sandwiches, somos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sandwiches = (Button) findViewById(R.id.sandwiches);
        getSupportActionBar().setTitle("FAST FOOD");
        sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListaSandwiches.class);
                startActivity(i);
            }
        });
        somos = (Button) findViewById(R.id.nosotrossomos);
        somos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this, acercadenosotros.class);
                startActivity(a);
            }
        });
    }
}
