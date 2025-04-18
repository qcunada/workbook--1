package week2.miniprojects;

import java.util.Scanner;

public class StringAnalyzer {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //ask the user for a sentence
        System.out.println("Please input a sentence: ");
        String inputSentence = scanner.nextLine();

        //.length() returns the number of characters in the string, including spaces and punctuation.
        int length = inputSentence.length();
        System.out.println("The sentence has " + length + " characters.");


        //split(" ") breaks the string wherever it finds a space.
        // This creates an array of words — even though they haven’t learned arrays,
        // we’re not doing anything array-ish except .length and reading from it.
        String[] words = inputSentence.split(" ");
        int wordCount = words.length;
        System.out.println("The sentence has " + wordCount + " words.");


        if (inputSentence.length() > 0) {
            System.out.println("First character: " + inputSentence.charAt(0));
            System.out.println("Last character: " + inputSentence.charAt(inputSentence.length() - 1));

    }


        }
}
