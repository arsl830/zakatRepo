package com.example.arsalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView gold, silver, cash, total;
    Button calculate;
    float gold_t, silver_t, cash_t;
    double total_t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gold=findViewById(R.id.gold);
        silver=findViewById(R.id.silver);
        cash=findViewById(R.id.cash);
        total=findViewById(R.id.total);
        calculate=findViewById(R.id.calculate);
}