package org.launchcode.java.studios.class04funwithquizzes;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        MultipleChoice firstMultipleChoiceQuestion = new MultipleChoice("What month is Labor Day in?" + "\nA: March \nB: July \nC: April \nD: September", "D");
        quiz.addQuestion(firstMultipleChoiceQuestion);

        TrueFalse firstTrueFalseQuestion = new TrueFalse("The blue whale is the largest animal to have ever lived." + "\nTrue or False?", "True");
        quiz.addQuestion(firstTrueFalseQuestion);

        Checkbox firstCheckboxQuestion = new Checkbox("Which of the following months are in Spring?" + "\nA: June \nB: April \nC: March \nD: August", "B,C");
        quiz.addQuestion(firstCheckboxQuestion);

        quiz.runQuiz();
    }
}
