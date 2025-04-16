package week2;

import java.util.Scanner;

public class MethodExercise2 {
    static Scanner scanner = new Scanner(System.in);
    // 1.
    public static void main(String[] args) {
        String titledName = getPlayerTitle("Kunta");
        System.out.println(titledName);

     // 2.

      int doubledXP = doubleXP(300);
        System.out.println( "your current xp is now doubled with "+ doubledXP);

      // 3.
        if (hasLeveledUp(600, 500)){
            System.out.println("You leveled up!");
        }else {
            System.out.println("Keep grinding..");
        }

      // 4.
        System.out.println("first roll dice : " + rollDice());
        System.out.println("second roll dice : " + rollDice());
        System.out.println("third roll dice : " + rollDice());

      // 5.
         int strength = 20;
         int enemyDefense = 35;
         calculateDamage(20,35);

       // 6.
        System.out.println("Test 1 (false, false): " + canOpenChest(false, false));
        System.out.println("Test 2 (false, true): " + canOpenChest(false, true));
        System.out.println("Test 3 (true, false): " + canOpenChest(true, false));
        System.out.println("Test 4 (true, true): " + canOpenChest(true, true));

       //7.
        System.out.println("Choose a player class, Warrior(1), Mage(2), Rogue(3): ");
        int choice = scanner.nextInt();

        String playerClass = getPlayerClass(choice);
        System.out.println("You are a: " + playerClass);












    }
    // 1.
    public static String getPlayerTitle (String name) {
        return "King " + name;
    }
    // 2.
    public static int doubleXP (int xp) {
        System.out.println("your current xp is: " + xp);
        return xp * 2;
    }
    // 3.
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return (currentXP > threshold);
    }
    // 4.
    public static int rollDice() {
        return (int)(Math.random()* 6);
    }
    // 5.
    public static int calculateDamage(int strength, int enemyDefense){
        int damage = (strength * 2) - enemyDefense;

        if (damage < 0){
            damage = 0;
        }
        System.out.println("Damage dealt: " + damage);
        return damage;
    }
    // 6.
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken){
        return hasKey || lockIsBroken;
    }
    // 7.
    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            return "Warrior!";
        } else if (choice == 2) {
            return "Mage!";
        } else if (choice == 3) {
            return "Rogue!";
        } else {
            return "Peasant";
        }
    }







}




