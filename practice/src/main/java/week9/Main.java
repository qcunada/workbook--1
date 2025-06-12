package week9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome the rock paper scissors game!");
        System.out.println("choose between rock paper or scissors: ");
        String playerTurn = scanner.nextLine();

        String[] moves = {"rock","paper","scissors"};
        Random random = new Random();
        int index = random.nextInt(moves.length);
        String computerMove = moves[index];
        System.out.println("You chose: " + playerTurn + "\nComputer chose: " + computerMove);

        if (playerTurn.equalsIgnoreCase(computerMove)){
            System.out.println("It's a tie!");
        } else if (playerTurn.equals("rock") && computerMove.equals("scissors")) {

        } else if ((playerTurn.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("you won!");


        }


    }
}
