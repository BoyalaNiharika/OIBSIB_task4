package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HowToPlay extends AppCompatActivity {

    //variables
    private AppCompatButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        // Initialize the back button
        back = findViewById(R.id.back);

        // Set click listener for the back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go back to the MainActivity
                Intent intent = new Intent(HowToPlay.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}