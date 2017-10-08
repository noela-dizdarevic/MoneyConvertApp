package com.noela.moneyconvertapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view) {

        EditText bamAmountText = (EditText) findViewById(R.id.bamAmountId);

        Double bamAmountdouble = Double.parseDouble(bamAmountText.getText().toString());

        Double euroAmount = bamAmountdouble * 0.51;

        Toast.makeText(this,"€ " + euroAmount.toString(), Toast.LENGTH_SHORT).show();

        Log.i("amount", bamAmountText.getText().toString());
        
        


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
