package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        /***************************CREDITS SCREEN************************************************/
        TextView returnLogIn = (TextView) findViewById(R.id.return_log_in);
        returnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Credits.this, LogIn.class);
                startActivity(numbersIntent);
            }
        });
    }
}
