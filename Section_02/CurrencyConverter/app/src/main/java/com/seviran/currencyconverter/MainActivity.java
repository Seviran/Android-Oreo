package com.seviran.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view)
    {
        EditText currencyEditText = findViewById(R.id.currencyEditText);
        String amountInEuro = currencyEditText.getText().toString();
        double amountInEuroDouble = Double.parseDouble(amountInEuro);
        double amountInDollarDouble = amountInEuroDouble *= 1.20307;
        String amountInDollar = Double.toString(amountInDollarDouble);
        Toast.makeText(this, "€" + amountInEuro + " is $" + amountInDollar, Toast.LENGTH_SHORT).show();
    }
}
