package week2;

import java.util.Scanner;

public class StringExercises {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // 1. Hello Name
        String name = "John";
        System.out.println("Hello " + name);

        // 2. String Length
        int length = name.length();
        System.out.println(name.length());

        // 3. First and Last Character
        char firstChar = name.charAt(0);
        System.out.println(firstChar);
        char lastChar = name.charAt(3);
        System.out.println(lastChar);

        //4. Uppercase or Lowercase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // 5.String contains Java
        String sentence = "I love Java!";
        boolean isJava = sentence.contains("Java");
        System.out.println(isJava);

        // 6. Are they equal?
        System.out.println((name.equals(sentence)));

        // 7. Start and End Match
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        boolean startsA = word.startsWith("A");
        boolean endsZ = word.endsWith("Z");
        if (startsA || endsZ) {
            System.out.println("Word starts with A and end with Z");
        } else {
            System.out.println("Word doesn't with A and end with Z");
        }




}



}