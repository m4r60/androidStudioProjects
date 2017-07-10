package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        /***************************HOME SCREEN************************************************/
        LinearLayout home = (LinearLayout) findViewById(R.id.home_nav);
        home.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlayList.this, Home.class);
                startActivity(homeIntent);
            }
        });


        /***************************SEARCH SCREEN************************************************/
        LinearLayout search = (LinearLayout) findViewById(R.id.search_nav);
        search.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlayList.this, Search.class);
                startActivity(searchIntent);
            }
        });

        /***************************RADIO SCREEN************************************************/
        LinearLayout radio = (LinearLayout) findViewById(R.id.radio_nav);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(PlayList.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        /***************************BUY SCREEN************************************************/
        LinearLayout buy = (LinearLayout) findViewById(R.id.buy_nav);
        buy.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(PlayList.this, Buy.class);
                startActivity(buyIntent);
            }
        });
    }
}
