package com.example.hagaloustedmismo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardView, contrapiso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        cardView =findViewById(R.id.medianera);
        contrapiso= findViewById(R.id.contrapiso);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent medianera = new Intent(MainActivity.this, MedianeraActivity.class);
                startActivity(medianera);
            }
        });

        contrapiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contrapiso = new Intent(MainActivity.this, ContrapisoActivity.class);
                startActivity(contrapiso);
            }
        });




    }
}
