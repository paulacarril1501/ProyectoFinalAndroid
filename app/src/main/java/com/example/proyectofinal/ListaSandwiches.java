package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import java.util.ArrayList;

public class ListaSandwiches extends AppCompatActivity {
    LinearLayout listaContenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sandwiches);
        listaContenedor = (LinearLayout) findViewById(R.id.listaContenedor);

        int imagenI = R.drawable.italiano;
        String italian = getString(R.string.italiano);
        String desItal = getString(R.string.descripItaliano);
        String preItal = getString(R.string.precioItaliano);

        int imagenChac = R.drawable.chacarero;
        String chacar = getString(R.string.chacarero);
        String desChacar = getString(R.string.descripChacarero);
        String preChacar = getString(R.string.precioChacarero);

        int imagenB = R.drawable.barrosluco;
        String barr = getString(R.string.barros);
        String desBarr = getString(R.string.descripBarros);
        String preBarr = getString(R.string.precioBarros);

        int imagenH = R.drawable.hawaiano;
        String hawaia = getString(R.string.hawaiano);
        String desHawaia = getString(R.string.descripHawaiano);
        String preHawaia = getString((R.string.precioHawaiano));

        int imagenCho = R.drawable.chorrillano;
        String chorri = getString(R.string.chorrillano);
        String desChorri = getString(R.string.descripChorrillano);
        String preChorri = getString(R.string.precioChorrillano);




        ArrayList<tipoSandwich> lista = new ArrayList<tipoSandwich>();
        lista.add(new tipoSandwich(imagenI, italian, desItal, preItal));
        lista.add(new tipoSandwich(imagenChac, chacar, desChacar, preChacar));
        lista.add(new tipoSandwich(imagenB, barr, desBarr, preBarr));
        lista.add(new tipoSandwich(imagenH, hawaia, desHawaia, preHawaia));
        lista.add(new tipoSandwich(imagenCho, chorri, desChorri, preChorri));
        getSupportActionBar().setTitle("Sandwiches");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        for (final tipoSandwich c: lista){
            Button botones = new Button(getApplicationContext());
            botones.setText(c.nombre);
            botones.setId(c.id);
            botones.setTextColor(Color.parseColor("#7A4D1D"));
            botones.setBackgroundColor(Color.parseColor("#75DAAD"));
            botones.setTextSize(30);


            listaContenedor.addView(botones);
            botones.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(getApplicationContext(), "Button:" +v.getId(), Toast.LENGTH_SHORT).show();


                    Intent a = new Intent(ListaSandwiches.this, sandwichItaliano.class);
                    a.putExtra("id", c.id);
                    a.putExtra("nombre", c.nombre );
                    a.putExtra("descrip", c.descrip);
                    a.putExtra("precio", c.precio);
                    startActivity(a);


                }
            });










        }

    }

    class tipoSandwich{

        public int id;
        public String nombre;
        public String descrip;
        public String precio;

        public tipoSandwich(int id, String nombre, String descrip, String precio){
            this.nombre = nombre;
            this.id = id;
            this.descrip = descrip;
            this.precio = precio;
        }

    }
}
