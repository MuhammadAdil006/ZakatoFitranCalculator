package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatSilver extends AppCompatActivity {

    EditText Tola,TolaRs;
    TextView SilverOutput;
    Button SilverCal;
    double tola;
    int  tolaRs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_silver);
        Tola=(EditText) findViewById(R.id.SilverInput);
        TolaRs=(EditText) findViewById(R.id.TolaInRs);
        SilverOutput= (TextView) findViewById(R.id.SilverZakatoutput);
        SilverCal=(Button) findViewById(R.id.CalculateZakatSilver);

        SilverCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable a=  Tola.getText();
                tola=Double.parseDouble(String.valueOf(a));
                tolaRs=Integer.parseInt(String.valueOf( TolaRs.getText()));
                if(tola>=52.5)
                {
                    //zakat is wajib 2.5 %
                    double total=tola*tolaRs;
                    total=total*0.025;
                    SilverOutput.setText(Double.toString(total) );

                }else
                {
                    SilverOutput.setText((String)"Zakat is not wajib");
                }

            }
        });
    }
}