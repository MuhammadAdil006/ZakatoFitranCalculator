package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatGold extends AppCompatActivity {
    EditText Tola,TolaRs;
    TextView GoldOutput;
    Button GoldCal;
    double tola;
    int  tolaRs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tola=0.0;tolaRs=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_gold);
        Tola=(EditText) findViewById(R.id.GoldInput);
        TolaRs=(EditText) findViewById(R.id.TolaInRs);
        GoldOutput= (TextView) findViewById(R.id.GoldZakatoutput);
        GoldCal=(Button) findViewById(R.id.CalculateZakatGold);

        GoldCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable a=  Tola.getText();
                tola=Double.parseDouble(String.valueOf(a));
                tolaRs=Integer.parseInt(String.valueOf( TolaRs.getText()));
                if(tola>=7.5)
                {
                    //zakat is wajib 2.5 %
                    double total=tola*tolaRs;
                    total=total*0.025;
                    GoldOutput.setText(Double.toString(total) );

                }else
                {
                    GoldOutput.setText((String)"Zakat is not wajib");
                }

            }
        });

    }

}