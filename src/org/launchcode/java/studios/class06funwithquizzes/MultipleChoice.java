package org.launchcode.java.studios.class06funwithquizzes;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
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
