package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void showRupee(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.dollarAmount);
        double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
        dollarAmountDouble *= 71.65;
        Toast.makeText(this, dollarAmount.getText().toString() + " is " + "Rs." + String.format("%.2f", dollarAmountDouble), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }
}
