package week7.GuessTheNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessingGame game = new GuessingGame(scanner, new ArrayList<>());
        game.startGame();
    }
}
