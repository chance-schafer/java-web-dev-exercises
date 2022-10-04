package org.launchcode.java.studios.class06funwithquizzes;

public class Checkbox extends Question {

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getAnswer();
        if(answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            return false;
        }
    }
}
