package com.example.guessname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showGuess;
    private EditText guessField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showGuess = findViewById(R.id.guessButton);
        guessField = findViewById(R.id.guessField);


        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String guess = guessField.getText().toString().trim();
                if (!guess.isEmpty()){
                    Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                    intent.putExtra("guess", guess);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Enter guess.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}