package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zakat extends AppCompatActivity {
    Button g,s,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);
        g=(Button) findViewById(R.id.gold);
        s=(Button) findViewById(R.id.silver);
        c=(Button)findViewById(R.id.cash);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(Zakat.this,ZakatGold.class);
                startActivity(intent2);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(Zakat.this,ZakatSilver.class);
                startActivity(intent3);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent(Zakat.this,ZakatCash.class);
                startActivity(intent4);
            }
        });
    }
}