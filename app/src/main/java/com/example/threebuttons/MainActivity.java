package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    public static int request;
    public String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this, ThreeTexts.class);


        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               text = "@string/text1";
               intent.putExtra(text, request);
               startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request = 2;
                intent.putExtra(text, request);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request = 3;
                intent.putExtra(text, request);
                startActivity(intent);
            }
        });



    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, ThreeTexts.class);
        startActivity(intent);
    }
}