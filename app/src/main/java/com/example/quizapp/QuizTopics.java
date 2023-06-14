package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QuizTopics extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_topics);

        final LinearLayout java = findViewById(R.id.javalayout);
        final LinearLayout python = findViewById(R.id.pythonlayout);
        final LinearLayout cplusplus = findViewById(R.id.cpluspluslayout);
        final LinearLayout c = findViewById(R.id.cprogramming);
        final LinearLayout html = findViewById(R.id.htmllayout);
        final LinearLayout css = findViewById(R.id.csslayout);
        final LinearLayout sql = findViewById(R.id.sqllayout);
        final LinearLayout javascript = findViewById(R.id.javascriptlayout);

        final Button startBtn = findViewById(R.id.startquiz_btn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "java";
                java.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "python";
                python.setBackgroundResource(R.drawable.round_stroke);
                java.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        cplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "c++";
                cplusplus.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "c";
                c.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "html";
                html.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "css";
                css.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "sql";
                sql.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
                javascript.setBackgroundResource(R.drawable.round);
            }
        });
        javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "javascript";
                javascript.setBackgroundResource(R.drawable.round_stroke);
                python.setBackgroundResource(R.drawable.round);
                cplusplus.setBackgroundResource(R.drawable.round);
                java.setBackgroundResource(R.drawable.round);
                html.setBackgroundResource(R.drawable.round);
                css.setBackgroundResource(R.drawable.round);
                sql.setBackgroundResource(R.drawable.round);
                c.setBackgroundResource(R.drawable.round);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(QuizTopics.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(QuizTopics.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}