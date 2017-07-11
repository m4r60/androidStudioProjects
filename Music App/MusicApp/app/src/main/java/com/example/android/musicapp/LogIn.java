package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicapp.R.layout.log_in;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(log_in);

        /***************************HOME SCREEN************************************************/
        Button logIn = (Button) findViewById(R.id.angry_btn);
        logIn.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(LogIn.this, Home.class);
                startActivity(numbersIntent);
            }
        });

        /***************************CREDITS SCREEN************************************************/
        TextView credits = (TextView) findViewById(R.id.credits);
        credits.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(LogIn.this, Credits.class);
                startActivity(numbersIntent);
            }
        });



    }

}
