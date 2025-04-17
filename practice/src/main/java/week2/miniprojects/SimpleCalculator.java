package week2.miniprojects;

import java.util.Scanner;

public class SimpleCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Ask for the first number
        System.out.println("Enter the first number");
        double num1 = Double.parseDouble(scanner.nextLine());


        // Ask for the second number
        System.out.println("Enter the second number");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Ask for the Operator
        System.out.println("Choose an operator (+,-,*,/): ");
        String operator = scanner.nextLine();


        System.out.println("Result: " + calculatorResult(num1,num2,operator));


        }
    public static double calculatorResult(double a, double b, String op) {
        if (op.equals("+")) return a + b;
        else if (op.equals("-")) return a - b;
        else if (op.equals("*")) return a * b;
        else if (op.equals("/")) return a / b;
        else {
            System.out.println("Unknown operator.");
            return 0;
    }


    }
}
