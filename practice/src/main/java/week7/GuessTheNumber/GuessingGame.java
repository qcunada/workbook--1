package week7.GuessTheNumber;

import java.util.List;
import java.util.Scanner;

public class GuessingGame implements PlayableGame {
    Scanner scanner = new Scanner(System.in);
    private int target;
    private List<Integer> guesses;

    public GuessingGame(Scanner scanner, List<Integer> guesses) {
        this.scanner = scanner;
        this.target = 25;
        this.guesses = guesses;
    }

    @Override
    public void startGame() {
        System.out.println("WELCOME TO THE GAME \n");

        int guess = 0;

        while (guess != target) {
            System.out.print("Guess a number from 1-100: ");
            guess = scanner.nextInt();
            guesses.add(guess);

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("You got it right!!");
                System.out.println("Your guesses: " + guesses);
            }
        }

    }
}
