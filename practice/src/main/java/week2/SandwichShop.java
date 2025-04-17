package week2;

import java.util.Scanner;

public class SandwichShop {

     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double basePriceRegular = 5.45;
        double basePriceLarge = 8.95;
        // 17 < age 10% discount
        // age > 65 20% discount


        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("do you want regular(1) or large(2)?");
        int size = scanner.nextInt();

        double basePrice = 0; // Initialize
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        }
        // x .5
        System.out.println("Do you want your Sandwich loaded? (yes/no): ");
        scanner.nextLine();
        String loaded = scanner.nextLine();

        if (loaded.equalsIgnoreCase("yes")){
            basePrice = basePrice * 1.5;
        }


        // discount
        System.out.println("What is your age? Discounts may apply");
        int age = scanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount =  0.10; //10% discount
        } else if (age >= 65) {
            discount = 0.20; // 20% discount
        } else {
            System.out.println("no discount");
        }

        double finalPrice = basePrice - (basePrice * discount);
        System.out.println("Your final price is $" + finalPrice);




    }




}