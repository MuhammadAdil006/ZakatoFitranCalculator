package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FitRana extends AppCompatActivity {
    Button KishMish,Wheat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitrana);
        KishMish =(Button) findViewById(R.id.Kishmish);
        Wheat =(Button) findViewById(R.id.Wheat);
        KishMish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(FitRana.this,KishmishFitrana.class);
                startActivity(intent6);
            }
        });
        Wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(FitRana.this,Wheat_Fitrana.class);
                startActivity(intent6);
            }
        });
    }
}