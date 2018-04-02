package com.example.simuladordecaixa.estadosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class DescreveEstadoActivity extends AppCompatActivity {

    private TextView textToSet;
    private Button buttonReturn;
    private Button exitDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descreve_estado);

        textToSet = findViewById(R.id.tvScreenDescreveEstado);
        buttonReturn = findViewById(R.id.btReturnDescribeState);
        exitDescription = findViewById(R.id.buttonExitDescription);

        //Recupera params
        Intent getIntent = getIntent();
        String description = getIntent.getStringExtra("Desc");
        final String url = getIntent.getStringExtra("Url");
        final String description2 = getIntent.getStringExtra("title");
        textToSet.setText(description);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent backToMenu = new Intent(DescreveEstadoActivity.this, TelaVideosActivity.class);
                finish();
                backToMenu.putExtra("Url", url);
                backToMenu.putExtra("titleVideos", description2);
                startActivity(backToMenu);

            }
        });

        exitDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent exit = new Intent(DescreveEstadoActivity.this, EstadosActivity.class);
                finish();
                startActivity(exit);

            }
        });
    }
}
