package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fitrana extends AppCompatActivity {
    Button Kishmish,Wheat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Kishmish=(Button) findViewById(R.id.Kishmish);
        Wheat =(Button) findViewById(R.id.Wheat);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitrana);

        Kishmish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(Fitrana.this,KishmishFitrana.class);
                startActivity(intent6);
            }
        });
        Wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(Fitrana.this,Wheat_Fitrana.class);
                startActivity(intent6);
            }
        });
    }
}