package week2;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Your full name is: " +namePrompter());


    }

    public static String namePrompter() {

        System.out.println("What is your first name?");
        String first = scanner.nextLine().trim();

        System.out.println("What is your last name?");
        String last = scanner.nextLine().trim();

        String middle = "";
        System.out.println("Do you have a middle name? (y/n)");
        String hasMiddle = scanner.nextLine().trim();

        if (hasMiddle.equalsIgnoreCase("y")) {
            System.out.println("Enter your middle name:");
            middle = scanner.nextLine().trim();
        }

        String suffix = "";
        System.out.println("Do you have a suffix? (y/n)");
        String hasSuffix = scanner.nextLine().trim();

        if (hasSuffix.equalsIgnoreCase("y")) {
            System.out.println("Enter your suffix:");
            suffix = scanner.nextLine().trim();
        }

        // Build full name
        String fullName = first;

        if (!middle.isEmpty()) {
            fullName += " " + middle;
        }

        fullName += " " + last;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        return fullName;


    }
}
