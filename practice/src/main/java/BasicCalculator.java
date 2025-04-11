import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(num1 * num2);

        scanner.nextLine();

        // asks operation
        System.out.println("Do you want to add, subtract, multiply or divide?");
        String operation = scanner.nextLine();
        System.out.println("You've chosen " + operation);

        // multiply
        double result = num1 * num2;
        System.out.println("Result: " + result);







    }







}

