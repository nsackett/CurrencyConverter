package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView5;
    Double conversion = 0.77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView5 = findViewById(R.id.textView5);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView5.setText("£ " + Double.parseDouble(str)*conversion);
    }
}
