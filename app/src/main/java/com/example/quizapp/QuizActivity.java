package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    //variables
    private TextView questions;
    private TextView question;
    private AppCompatButton option1,option2,option3,option4;
    private AppCompatButton nextBtn;
    private Timer quizTimer;
    private int totalTimeInMins = 2;
    private int seconds = 59;
    private List<QuestionList> questionsLists;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Initialize variables and connect them with corresponding views
        final ImageView backbtn = findViewById(R.id.backbtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topic);
        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.nextbtn);

        // Get the selected topic name from the previous activity
        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        // Set the selected topic name in the UI
        selectedTopicName.setText(getSelectedTopicName);

        // Retrieve the list of questions for the selected topic
        questionsLists=QuestionsBank.getQuestions(getSelectedTopicName);

        // Start the timer
        startTimer(timer);

        // Display the first question and its options
        questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());

        // Event listener for option 1 button click
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    // Store the selected option and highlight it
                    selectedOptionByUser=option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_red);
                    option1.setTextColor(Color.WHITE);

                    // Reveal the correct answer
                    revealAnswer();

                    // Store the user's selected answer in the question object
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        // Event listener for option 2 button click
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){

                    // Store the selected option and highlight it
                    selectedOptionByUser=option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_red);
                    option2.setTextColor(Color.WHITE);

                    // Reveal the correct answer
                    revealAnswer();

                    // Store the user's selected answer in the question object
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        // Event listener for option 3 button click
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){

                    // Store the selected option and highlight it
                    selectedOptionByUser=option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_red);
                    option3.setTextColor(Color.WHITE);

                    // Reveal the correct answer
                    revealAnswer();

                    // Store the user's selected answer in the question object
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        // Event listener for option 4 button click
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){

                    // Store the selected option and highlight it
                    selectedOptionByUser=option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_red);
                    option4.setTextColor(Color.WHITE);

                    // Reveal the correct answer
                    revealAnswer();

                    // Store the user's selected answer in the question object
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        // Event listener for Next button click
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();
                }
            }
        });

        // Event listener for back button click
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cancel the timer and navigate back to the QuizTopics activity
                quizTimer.purge();
                quizTimer.cancel();
                startActivity(new Intent(QuizActivity.this,QuizTopics.class));
                finish();
            }
        });
    }

    // Method to change to the next question
    private void changeNextQuestion(){
        // Increment the current question position
        currentQuestionPosition++;
        // Change the Next button text to "Submit Quiz" if it's the last question
        if((currentQuestionPosition+1)==questionsLists.size()){
           nextBtn.setText("Submit Quiz");
       }
        // If there are more questions, update the UI with the next question and options
        if(currentQuestionPosition<questionsLists.size()){
           selectedOptionByUser="";

           // Reset the styling of the options
            option1.setBackgroundResource(R.drawable.round_white_stroke);
           option1.setTextColor(Color.parseColor("#1f6bb8"));

           option2.setBackgroundResource(R.drawable.round_white_stroke);
           option2.setTextColor(Color.parseColor("#1f6bb8"));

           option3.setBackgroundResource(R.drawable.round_white_stroke);
           option3.setTextColor(Color.parseColor("#1f6bb8"));

           option4.setBackgroundResource(R.drawable.round_white_stroke);
           option4.setTextColor(Color.parseColor("#1f6bb8"));

            // Update the question and options in the UI
            questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
           question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
           option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
           option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
           option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
           option4.setText(questionsLists.get(currentQuestionPosition).getOption4());
       }
        // If it's the last question, submit the quiz and show the results
        else{
           Intent intent = new Intent(QuizActivity.this,QuizResults.class);
           intent.putExtra("correct",getCorrectAnswers());
           intent.putExtra("incorrect",getInCorrectAnswers());
           startActivity(intent);
           finish();
       }
    }

    // Method to start the timer
    private void startTimer(TextView timerTextView){
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Update the timer every second
                if(seconds == 0 && totalTimeInMins != 0){
                    totalTimeInMins--;
                    seconds=59;
                }
                else if(seconds == 0 && totalTimeInMins == 0){
                    // If the time is up, cancel the timer and show the quiz results
                    quizTimer.purge();
                    quizTimer.cancel();
                    Intent intent = new Intent(QuizActivity.this,QuizResults.class);
                    intent.putExtra("correct",getCorrectAnswers());
                    intent.putExtra("incorrect",getInCorrectAnswers());
                    startActivity(intent);
                    finish();
                }
                else{
                    seconds--;
                }
                // Update the timer TextView on the UI thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes = String.valueOf(totalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);

                        // Add leading zeros if necessary
                        if(finalMinutes.length()==1){
                            finalMinutes="0"+finalMinutes;
                        }
                        if(finalSeconds.length()==1){
                            finalSeconds="0"+finalSeconds;
                        }
                        timerTextView.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        },1000,1000);
    }

    // Method to calculate the number of correct answers
    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for(int i=0;i<questionsLists.size();i++){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();
            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    // Method to calculate the number of incorrect answers
    private int getInCorrectAnswers(){
        int correctAnswers = 0;
        for(int i=0;i<questionsLists.size();i++){
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();
            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }
    @Override
    public void onBackPressed() {
        // Handle the back button press by starting the QuizTopics
        quizTimer.purge();
        quizTimer.cancel();
        startActivity(new Intent(QuizActivity.this,QuizTopics.class));
        finish();
    }

    // Method to reveal the correct answer
    private void revealAnswer(){
        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();
        if(option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_green);
            option1.setTextColor(Color.WHITE);
        }
        else if (option2.getText().toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_green);
            option2.setTextColor(Color.WHITE);
        }
        else if (option3.getText().toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_green);
            option3.setTextColor(Color.WHITE);
        }
        else if (option4.getText().toString().equals(getAnswer)){
            option4.setBackgroundResource(R.drawable.round_green);
            option4.setTextColor(Color.WHITE);
        }
    }
}
