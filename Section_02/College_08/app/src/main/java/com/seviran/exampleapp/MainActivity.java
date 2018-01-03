package com.seviran.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view)
    {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Log.i("Info", "It worked!");
        Log.i("Username", nameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());
        Log.i("Username", nameEditText.getText().toString());
        if(nameEditText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Hello " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void switchCat(View view)
    {
        ImageView catImageView = findViewById(R.id.catImageView);
        catImageView.setImageResource(R.drawable.cat2);
    }

}
