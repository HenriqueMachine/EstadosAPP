package com.example.simuladordecaixa.estadosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class TelaVideosActivity extends AppCompatActivity {

    private WebView screenVideos;
    private TextView titleScreenVideos;
    private Button buttonListOfStates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_videos);

        screenVideos = findViewById(R.id.webViewVideo);
        titleScreenVideos = findViewById(R.id.textViewTelaVideo);
        buttonListOfStates = findViewById(R.id.button);

        //Recupera params title
        Intent getIntent = getIntent();
        String urlYouTube = getIntent.getStringExtra("Url");
        String description = getIntent.getStringExtra("titleVideos");
        titleScreenVideos.setText(description);
        urlToSet(urlYouTube);


        buttonListOfStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent backToStates = new Intent(TelaVideosActivity.this, EstadosActivity.class);
                finish();
                startActivity(backToStates);
            }
        });

    }

    private class MyBrowser extends WebViewClient{

        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }

    }

    private void urlToSet (String url){

        screenVideos.setWebViewClient(new MyBrowser());
        screenVideos.getSettings().setJavaScriptEnabled(true);
        screenVideos.loadUrl("https://www.youtube.com/embed/"+url+"?autoplay=1$vq=small");
        screenVideos.setWebChromeClient(new WebChromeClient());

    }

}
