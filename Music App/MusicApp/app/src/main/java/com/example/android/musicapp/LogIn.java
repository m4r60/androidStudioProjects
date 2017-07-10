package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import static com.example.android.musicapp.R.layout.log_in;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(log_in);

        /***************************HOME SCREEN************************************************/
        // Buscamos el elemento por ID
        Button logIn = (Button) findViewById(R.id.angry_btn);

        // Configuramos un click Listener a esa TextView
        logIn.setOnClickListener(new View.OnClickListener() {
            // Cuando la Text View sea clicada se ejecutarán las líneas de código de abajo.
            //Sobreescribimos este método.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(LogIn.this, Home.class);
                startActivity(numbersIntent);
            }
        });



    }

}
/*Cambiar icono  de la aplicación
Here is another solution which I feel is more sensible for those working on Android Studio:

Expand the project root folder in the Project View
Right Click on the app folder
In the Context Menu go to New->Image Asset
In the pop up that appears select the the new logo you would like to have(image/clip art/text).
That is it! You have a new logo for you app now.*/