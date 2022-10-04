package org.launchcode.java.studios.class04funwithquizzes;

public abstract class Question {
    private String questionString;
    private String answerString;

    public Question(String questionString, String answerString) {
        this.questionString = questionString;
        this.answerString = answerString;
    }



    public String getQuestion() {
        return this.questionString;
    }

    public String getAnswer() {
        return this.answerString;
    }

    public abstract boolean checkAnswer(String answer);

}
