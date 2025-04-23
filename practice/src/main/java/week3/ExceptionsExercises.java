package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercises {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // 1.Divide two numbers with exception handling Ask the user for two int numbers and divide them. Catch any exceptions.
      try {
          System.out.println("Provide 2 numbers to divide");
          System.out.println("First number: ");
          int nr1 = scanner.nextInt();
          System.out.println("Second number: ");
          int nr2 = scanner.nextInt();

         int result = nr1 / nr2;

          System.out.println("Result: " + result);
      } catch (InputMismatchException e) {
          System.out.println("Please enter a valid number");
      } catch (ArithmeticException e) {
          System.out.println("I cannot divide by zero.");
      }

      // 2. String to int conversion Ask the user to input a number as a string. Convert it with Integer.parseInt() and catch exceptions.
        System.out.println("Enter a number (as a string): ");

        try {
            System.out.println("Type a number");
            scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered the number: "+ number);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number.");
        }


        //3. Get age input Ask the user to enter their age. Repeat the question until they give a valid number.

        int age= 0;
        boolean ageSuccessFullyEntered = false;

        while (!ageSuccessFullyEntered){
            System.out.println("Please enter your age: ");
            String ageInput = scanner.nextLine();

            try {
                age = Integer.parseInt(ageInput);

                if (age > 0) {
                    ageSuccessFullyEntered = true;
                } else {
                    System.out.println("Age must be a positive number");
                }
                } catch (NumberFormatException e) {
                    System.out.println("That's not a valid number. Try again.");
                }

            }
        System.out.println("Your age is " + age + ".");

        //4. Guess the number game with exception handling Ask the user to guess a hardcoded number. Use exception handling to deal with wrong input types.
        int hardCodeNumber = 0;
        boolean rightGuess = false;

        while (!rightGuess) {
            System.out.println("Guess the number, from 1-30");
            String numberInput = scanner.nextLine();

            try {
                hardCodeNumber = Integer.parseInt(numberInput);  // Corrected method name

                if (hardCodeNumber == 23) {
                    rightGuess = true;
                    System.out.println("Congratulations! You guessed the correct number.");
                } else {
                    System.out.println("Your guess is wrong. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
            // 5. Temperature converter Ask the user for a temperature in Celsius. Catch exceptions if input is not a number.




    }
}
