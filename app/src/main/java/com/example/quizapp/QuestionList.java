package com.example.quizapp;

public class QuestionList {

    //variables
    private String question,option1,option2,option3,option4,answer;
    private String userSelectedAnswer;

    public QuestionList(String question, String option1, String option2, String option3, String option4, String answer, String userSelectedAnswer) {
        // Constructor to initialize the QuestionList object with the provided values
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    //Getter methods are provided for accessing the question, options, correct answer, and user-selected answer.
    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    //A setter method is provided to set the user-selected answer.
    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
