package com.example.simuladordecaixa.estadosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button goToEstadosScreen;
    private TextView goToAboutTheApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToEstadosScreen = (Button) findViewById(R.id.btEstados);
        goToAboutTheApp = (TextView) findViewById(R.id.tvSobre);

        goToAboutTheApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sobre = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(sobre);
            }
        });


        goToEstadosScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nextScreen = new Intent(MainActivity.this, EstadosActivity.class);
                startActivity(nextScreen);


            }
        });

    }
}
