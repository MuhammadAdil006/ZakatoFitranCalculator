package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button z,f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        z=(Button) findViewById(R.id.zakat);
        f=(Button) findViewById(R.id.fitrana);
        z.setOnClickListener(this);
        f.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.zakat:
                Intent intent=new Intent(MainActivity.this,Zakat.class);
                startActivity(intent);
                break;
            case R.id.fitrana:
                Intent intent12=new Intent(MainActivity.this, FitRana.class);
                startActivity(intent12);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}