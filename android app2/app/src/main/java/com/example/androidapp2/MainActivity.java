package com.example.androidapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text1 = findViewById(R.id.no1);
                EditText text2 = findViewById(R.id.no2);
                String x = text1.getText().toString();
                String y = text2.getText().toString();
                String z = x+y;
                TextView text = findViewById(R.id.add);
                text.setText(z);
            }
        });
    }
}