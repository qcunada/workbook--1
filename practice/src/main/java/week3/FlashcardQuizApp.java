package week3;

import java.util.Scanner;

public class FlashcardQuizApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[] questions = {"When is Christmas?", "What part of our body sees?", "What is common name for H20?", "Which planet do we live in?", "What language are we using for coding right now?"};

        String[] answers = {"December 25", "Eyes", "Water", "Earth", "Java"};

        int totalQuestions = questions.length;
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine().toLowerCase().trim();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correcto!");
                correctAnswers++;
            } else {
                System.out.println("Boop. You're wrong. The correct answer is " + answers[i]);
            }

        }
        System.out.println("Quiz is over!");
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        double percentage = (double)(correctAnswers / totalQuestions) * 100;
        System.out.println("Your score is " + percentage + "%");


    }
}
