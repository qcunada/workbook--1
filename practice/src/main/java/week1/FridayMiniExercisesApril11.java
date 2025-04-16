package week1;

import java.util.Scanner;

public class FridayMiniExercisesApril11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // problem 1 : your name
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("Hello," + name + "!" + " Welcome to the game.");



        // problem 2: age in dog years
        System.out.println("age: ");
        int age = scanner.nextInt();
        System.out.println("age in dog years: " + age * 7);
        scanner.nextLine();



        // problem 3 : random dice roll
        scanner.nextLine();
        int diceRoll = (int)(Math.random() * 6);
        System.out.println("DiceRoll: " +  diceRoll);



        //problem 4 : hero's stats
        scanner.nextLine();
        System.out.println("hero's name: ");
        String heroName = scanner.nextLine();

        System.out.println("strength: ");
        int strength = scanner. nextInt();
        scanner.nextLine();

        System.out.println("agility: ");
        int agility = scanner. nextInt();
        scanner.nextLine();

        System.out.println("Hero :" + heroName + "| Strength: " + strength + "| Agility: " + agility);




        // problem 5 : level up 1 from current level
        scanner.nextLine();
        System.out.println("current lvl :");
        int lvl = scanner.nextInt();
        System.out.println("You leveled up! You are now level " + (lvl + 1) );
        scanner.nextLine();



        //problem 6 : Coin Calculator
        scanner.nextLine();
        System.out.println("gold coins found: ");
        int gold = scanner.nextInt();
        System.out.println("silver coins found: ");
        int silver = scanner.nextInt();
        int goldPts = gold * 10;
        int silverPts = silver * 1;
        System.out.println("gold collected turn into points (1 gold = 10pts) :" + goldPts );
        scanner.nextLine();
        System.out.println("silver collected turn into points (1 silver = 1pt) :" + silverPts );
        scanner.nextLine();
        System.out.println("total points collected: " + (goldPts + silverPts));



        //problem 7 random roll dice (even/odd)
        scanner.nextLine();
        int rollDice =  (int)(Math.random() * 100);
        System.out.println("random roll dice: " + rollDice);
        scanner.nextLine();
        if (rollDice % 2 == 0) {
            System.out.println("your # is even");
        } else {
            System.out.println("your # is odd");
        }



        // problem 8  Critical Chance
        scanner.nextLine();
        System.out.println("critical hit chance: ");
        int chanceHit = scanner.nextInt();
        if (chanceHit > 50) {
            System.out.println("CRITICAL HIT!");
        } else {
            System.out.println("Normal Hit.");
        }
        scanner.nextLine();



        // problem 9 : Choose a character
        scanner.nextLine();
        System.out.println("Choose your Character (Warrior or Mage): ");
        String warOrMag = scanner.nextLine();
        if (warOrMag.equalsIgnoreCase("Warrior")) {
            System.out.println("You get a sword!");
        } else if (warOrMag.equalsIgnoreCase("Mage")){
            System.out.println("You get a staff!");
        }



        //problem 10 : guess the number
        scanner.nextLine();
        int hardCode = 10;
        System.out.println("Guess the number from 1-10: ");
        int hardCodeGuess = scanner.nextInt();
        if (hardCodeGuess == 10) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Wrong.");
        }

        //problem 11: Speed Trap
        scanner.nextLine();
        System.out.println("What is your player's speed? :");
        int playerSpeed = scanner.nextInt();
        if (playerSpeed > 100) {
            System.out.println("Too Fast!");
        }else {
            System.out.println("Safe speed.");
        }








    }

}
