package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+ "03244374171"));
                startActivity(intent);
            //    EditText text1 = findViewById(R.id.text1);
            //    String x = text1.getText().toString();
            //    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            //    intent.putExtra ("xyz",x);
            //    startActivity(intent);
            }
        });
    }
}