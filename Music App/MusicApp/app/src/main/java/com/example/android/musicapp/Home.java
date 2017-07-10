package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        /***************************SEARCH SCREEN************************************************/
        LinearLayout search = (LinearLayout) findViewById(R.id.search_nav);
        search.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(Home.this, Search.class);
                startActivity(searchIntent);
            }
        });

        /***************************RADIO SCREEN************************************************/
        LinearLayout radio = (LinearLayout) findViewById(R.id.radio_nav);
        radio.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(Home.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        /***************************PLAYLIST SCREEN************************************************/
        LinearLayout playlist = (LinearLayout) findViewById(R.id.playlist_nav);
        playlist.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(Home.this, PlayList.class);
                startActivity(playlistIntent);
            }
        });

        /***************************BUY SCREEN************************************************/
        LinearLayout buy = (LinearLayout) findViewById(R.id.buy_nav);
        buy.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(Home.this, Buy.class);
                startActivity(buyIntent);
            }
        });
    }
}
