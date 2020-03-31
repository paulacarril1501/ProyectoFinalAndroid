package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class sandwichItaliano extends AppCompatActivity {
    String nombre, descrip, precio;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich_italiano);

        nombre = getIntent().getStringExtra("nombre");
        id = getIntent().getIntExtra("id", 0);
        descrip = getIntent().getStringExtra("descrip");
        precio = getIntent().getStringExtra("precio");
        getSupportActionBar().setTitle(getString(R.string.detalle)+" "+nombre);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imagen = (ImageView) findViewById(R.id.imagenSandwich);
        TextView nombreS = (TextView) findViewById(R.id.textNombre);
        TextView descripS = (TextView) findViewById(R.id.textDescrip);
        TextView precioS = (TextView) findViewById(R.id.textPrecio);

        imagen.setImageResource(id);
        nombreS.setText(nombre);
        descripS.setText(descrip);
        precioS.setText(precio);

        nombreS.setTextSize(25);
        descripS.setTextSize(20);
        precioS.setTextSize(20);

        nombreS.setTypeface(null, Typeface.BOLD);
        precioS.setTypeface(null, Typeface.BOLD);



    }
}
