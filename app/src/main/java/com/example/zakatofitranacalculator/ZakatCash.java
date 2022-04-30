package com.example.zakatofitranacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatCash extends AppCompatActivity {
    EditText gold,silver,pricey;
    Button cal;
    TextView outputZakat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_cash);
        gold=(EditText) findViewById(R.id.GoldPerTola);
        silver=(EditText) findViewById(R.id.SilverPerTola);
        pricey=(EditText) findViewById(R.id.PriceYearly);
        cal=(Button) findViewById(R.id.calculateByCash);
        outputZakat=(TextView) findViewById(R.id.Output);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable a=  gold.getText();
                double goldperprice = Double.parseDouble(String.valueOf(a));
                goldperprice=goldperprice*7.5;
                double silverperprice=Integer.parseInt(String.valueOf( silver.getText()));
                silverperprice=silverperprice*52.5;

                double priceyearly=Integer.parseInt(String.valueOf( pricey.getText()));
                if(priceyearly>=goldperprice || priceyearly >=silverperprice)
                {
                    //wajib
                    priceyearly=priceyearly*0.025;
                    outputZakat.setText(Double.toString(priceyearly) );

                }else{
                    //not wajib
                    outputZakat.setText((String)"Zakat is not wajib");
                }
            }
        });
    }
}