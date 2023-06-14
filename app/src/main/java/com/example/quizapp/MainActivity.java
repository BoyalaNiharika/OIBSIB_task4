package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    //variables
    private AppCompatButton topics,howtoplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hooks
        topics = findViewById(R.id.topics);
        howtoplay = findViewById(R.id.howtoplay);

        // Set click listener for the topics button
        topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to the QuizTopics activity
                Intent intent = new Intent(MainActivity.this,QuizTopics.class);
                startActivity(intent);
                finish();

            }
        });

        // Set click listener for the how to play button
        howtoplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to the HowToPlay activity
                Intent intent = new Intent(MainActivity.this,HowToPlay.class);
                startActivity(intent);
                finish();

            }
        });
    }
}