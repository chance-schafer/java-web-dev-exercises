package org.launchcode.java.studios.class06funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int questionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {

    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    //Setters
    public void addQuestion(Question question) {
        this.questions.add(question);
    }


    public void runQuiz() {
        for(Question question : questions) {
            System.out.println(question.getQuestion());
            String answer = getProvidedAnswer();
            boolean correctlyAnswered = question.checkAnswer(answer);
            if(correctlyAnswered) {
                this.questionsCorrect++;
            }
        }

        double percentageCorrect = ((double) this.questionsCorrect / (double) this.questions.size() * 100 );
        System.out.println("Grade: " + percentageCorrect + "%");
    }



    private String getProvidedAnswer() {
        String providedAnswer = scanner.nextLine();
        return providedAnswer;
    }
}
