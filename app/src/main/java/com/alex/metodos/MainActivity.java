package com.alex.metodos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText muestra;
    private Button uno;
    private Button dos;
    private Button tres;
    private Button cuatro;
    private Button cinco;
    private Button seis;
    private Button siete;
    private Button ocho;
    private Button nueve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView muestra = findViewById(R.id.muestra);
Button uno = findViewById(R.id.uno);
Button dos = findViewById(R.id.dos);
Button tres = findViewById(R.id.tres);
Button cuatro = findViewById(R.id.cuatro);
Button cinco = findViewById(R.id.cinco);
Button seis = findViewById(R.id.seis);
Button siete = findViewById(R.id.siete);
Button ocho = findViewById(R.id.ocho);
Button nueve = findViewById(R.id.nueve);
Button cero = findViewById(R.id.cero);

uno.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int uno = 1;
        muestra.setText("" + uno);
    }
});

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int doss = 2;
                muestra.setText(""+ doss);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tress = 3;
                muestra.setText(""+ tress);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cuatroo = 4;
                muestra.setText(""+ cuatroo);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cincoo = 5;
                muestra.setText(""+ cincoo);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int seiss = 6;
                muestra.setText(""+ seiss);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int siete = 7;
                muestra.setText(""+ siete);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ocho = 8;
                muestra.setText(""+ ocho);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nueve = 9;
                muestra.setText(""+ nueve);
            }
        });


    }
}