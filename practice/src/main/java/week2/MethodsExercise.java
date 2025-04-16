package week2;

import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // welcome to the game
        sayWelcomeToTheGame();


        // what is your player's name
        String name = scanner.nextLine();
       displayPlayerName(name);


       // what is your level
       int level = scanner.nextInt();
        showLevel(level);
        scanner.nextLine();


        // attacker attacks target
        attack("squirtle","ratata","quick attack","hydro pump");
        scanner.nextLine();


        //found items
        foundItem("quincy","sword", "shield", "pizza");


        // casting spells
        castSpell("Harry","fireball", "cure", 45);

        // game over
        gameOver("quincy");


    }

    // 1. welcome to the game
    public static void sayWelcomeToTheGame() {
        System.out.println("Welcome to the code Quest!");
        System.out.println("player's name: ");
    }
    // 2. what is your player's name
    public static void displayPlayerName (String name) {
        System.out.println("Player joined: " + name);
        System.out.println("what is your level: ");
    }
    // 3. what is your level
    public static void showLevel(int level) {
        System.out.println(" you are level:" + level);

    }
    // 4. attacker attacks target
    public static void attack(String attacker, String target, String attack1, String attack2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(attacker + " attacks " + target + " with " + attack1);
        scanner.nextLine();
        System.out.println(attacker + " attacks " + target + " with " + attack2);

    }
    // 5. found items
    public static void foundItem(String player, String item, String item2, String item3) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(player +  " found a " + item);
        scanner.nextLine();
        System.out.println(player +  " found a " + item2);
        scanner.nextLine();
        System.out.println(player +  " found a " + item3);
        scanner.nextLine();
    }

    // 6. casting spells
    public static void castSpell(String wizard, String spellName, String spellName2, int manaCost ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(wizard + " casts "+ spellName + " costing " + manaCost + " mana cost.");
        scanner.nextLine();
        System.out.println(wizard + " casts "+ spellName2 + " costing " + manaCost + " mana cost.");
        scanner.nextLine();
    }

    public static void gameOver(String player) {
        System.out.println("GAMEOVER for " + player);
    }



}



