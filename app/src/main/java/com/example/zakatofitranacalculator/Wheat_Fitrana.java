package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Wheat_Fitrana extends AppCompatActivity {

    Button Cal;
    EditText Noofpersons,WheatPrice;
    TextView OutputPannel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Cal=(Button) findViewById(R.id.calculateWheatFitrana);
        Noofpersons=(EditText) findViewById(R.id.NooFPersons);
        WheatPrice=(EditText) findViewById(R.id.WheatPrice);
        OutputPannel=(TextView) findViewById(R.id.wheatFitranaOutput);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat_fitrana);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num= Integer.parseInt(String.valueOf(Noofpersons.getText())) ;
                Float price=Float.parseFloat(String.valueOf(WheatPrice.getText()));
                price=price*2*Num;
                OutputPannel.setText(String.valueOf(price));
            }
        });
    }
}