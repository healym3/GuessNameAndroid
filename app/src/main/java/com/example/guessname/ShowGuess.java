package com.example.guessname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);
        showGuessText = findViewById(R.id.textView);
        if (getIntent().getStringExtra("guess") != null){
            showGuessText.setText(getIntent().getStringExtra("guess"));
        }


    }
}