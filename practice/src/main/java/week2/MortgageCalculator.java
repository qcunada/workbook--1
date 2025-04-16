package week2;

import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // calculator 1

        // user input
        System.out.println("Enter the loan amount");
        double principal = scanner.nextDouble();
        System.out.println("Enter the annual rate, (ex: 7.625% is 0.07625): ");
        double annualRate = scanner.nextDouble();
        System.out.println("Enter loan term in years: ");
        int years = scanner.nextInt();

        // how much interest is applied to your loan each month
        double monthlyRate = (annualRate / 100) / 12;

        // Total number of monthly payments
        int totalPayments = years * 12;

        // Calculate monthly payment using the mortgage formula:
        // M = P × (i * (1 + i)^n) / ((1 + i)^n - 1)
        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) /
                (Math.pow(1 + monthlyRate, totalPayments) - 1);

        // Total interest = (monthly payment * number of payments) - principal
        double totalInterest = (monthlyPayment * totalPayments) - principal;

        // Display results
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);







    }
}
