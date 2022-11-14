package com.example.microondas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnT1;
    private Button btnT2;
    private Button btnT3;
    private Button btnT4;

    private Button btnS1;
    private Button btnS2;
    private Button btnS3;
    private Button btnS4;
    private Button btnS5;

    private TextView lblTemperatura;
    private TextView lblTiempo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializa();

        btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTemperatura.setText(R.string.t1);
            }
        });

        btnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTemperatura.setText(R.string.t2);
            }
        });

        btnT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTemperatura.setText(R.string.t3);
            }
        });

        btnT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTemperatura.setText(R.string.t4);
            }
        });

        btnS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTiempo.setText(R.string.s1);
            }
        });

        btnS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTiempo.setText(R.string.s2);
            }
        });

        btnS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTiempo.setText(R.string.s3);
            }
        });

        btnS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTiempo.setText(R.string.s4);
            }
        });

        btnS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTiempo.setText(R.string.s5);
            }
        });
    }

    private void inicializa() {
        btnT1 = findViewById(R.id.btnT1Main);
        btnT2 = findViewById(R.id.btnT2Main);
        btnT3 = findViewById(R.id.btnT3Main);
        btnT4 = findViewById(R.id.btnT4Main);

        btnS1 = findViewById(R.id.btnS1Main);
        btnS2 = findViewById(R.id.btnS2Main);
        btnS3 = findViewById(R.id.btnS3Main);
        btnS4 = findViewById(R.id.btnS4Main);
        btnS5 = findViewById(R.id.btnS5Main);

        lblTemperatura = findViewById(R.id.lblTemperaturaMain);
        lblTiempo = findViewById(R.id.lblTiempoMain);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("TEMPER", lblTemperatura.getText().toString());
        outState.putString("TIEMPO", lblTiempo.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lblTemperatura.setText(savedInstanceState.getString("TEMPER"));
        lblTiempo.setText(savedInstanceState.getString("TIEMPO"));
    }
}