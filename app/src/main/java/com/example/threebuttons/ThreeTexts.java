package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ThreeTexts extends AppCompatActivity {
    public static final String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_texts);
        ScrollView scrollView = findViewById(R.id.scrollview);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String request = intent.getStringExtra(text);





    }
}