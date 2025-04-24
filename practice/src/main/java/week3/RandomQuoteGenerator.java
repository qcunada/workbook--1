package week3;

import java.util.Scanner;

public class RandomQuoteGenerator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] quotes = {"You are not a drop in the ocean. You are the entire ocean in a drop.","Whether you think you can or you think you can’t, you’re right.","Discipline equals freedom.","Do not wait for the perfect moment. Take the moment and make it perfect.","You will never find time for anything. If you want time, you must make it.","Sometimes when you're in a dark place, you think you’ve been buried. But actually, you’ve been planted.","Everything you’ve ever wanted is sitting on the other side of fear.","Be yourself. Everyone else is already taken.","Success is not final, failure is not fatal: It is the courage to continue that counts.","Small steps in the right direction are better than big steps in the wrong direction."};

        System.out.println("Press enter to so see a quote! and type exit to stop");
        String userInput = scanner.nextLine().toLowerCase();

        int totalQuotes = quotes.length;

        if (userInput.equalsIgnoreCase("")){

        }


    }
}
