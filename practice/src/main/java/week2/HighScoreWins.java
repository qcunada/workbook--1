package week2;

import java.util.Scanner;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter game score,(TeamA:TeamB | ScoreA:ScoreB) : ");
        String input = scanner.nextLine().trim();

        String[] parts = input.split("\\|"); // were splitting the string in 2 parts with this "|"

        String[] teams = parts[0].split(":");  // the first part of the split
        String[] scores = parts[1].split(":"); // the second part of the split

        String teamA = teams[0].trim(); // this is where we separate TeamA with TeamB using (:)
        String teamB = teams[1].trim(); // we put .Trim() to ignore spaces on the input

        int teamAScore = Integer.parseInt(scores[0].trim()); //this is where we separate scoreA with scoreB using (:)
        int teamBScore = Integer.parseInt(scores[1].trim()); //we put .Trim() to ignore spaces on the input

        String winner;
        if (teamAScore > teamBScore){                 //if team A wins
            System.out.println(teamA + " win!");
        } else if (teamAScore < teamBScore) {
            System.out.println(teamB + " win!");

        } else {
            System.out.println("It's a tie!");
        }


    }
}
