package week2;

import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

         double basicCarRentalPerDay = 29.99;
         double electronicTollTag = 3.95;
         double gpsPerDay = 2.95;
         double roadAssistancePerDay = 3.95;


         //pickup date
        System.out.println("pick a date to pickup your car: ");
        String pickUpDate = scanner.nextLine();

        //number of days to rent
        System.out.println("number of days you will rent the car for: ");
        int nrOfDays = scanner.nextInt();
        scanner.nextLine();

        //option for a toll tag
        System.out.println("Would you want an electronic toll tag at $3.95/day, (yes/no)? ");
        String tollTagYesNo = scanner.nextLine().toLowerCase();

        //option for a GPS
        System.out.println("Would you want a GPS for $2.95/day, (yes/no)? ");
        String gpsYesNo = scanner.nextLine().toLowerCase();

        // roadside assistance
        System.out.println("Would you want roadside assistance at $3.95/day, (yes/no)? ");
        String roadAssistanceYesNo = scanner.nextLine().toLowerCase();

        //age
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        double baseRental = basicCarRentalPerDay * nrOfDays;

        double optionsCost = 0;
        if (tollTagYesNo.equalsIgnoreCase("yes")){
            optionsCost += electronicTollTag * nrOfDays;
        }
        if (gpsYesNo.equalsIgnoreCase("yes")) {
            optionsCost += gpsPerDay * nrOfDays;
        }
        if (roadAssistanceYesNo.equalsIgnoreCase("yes")){
            optionsCost += roadAssistancePerDay * nrOfDays;
        }

        double surcharge = 0;
        if (age < 25) {
            surcharge = baseRental * 0.30;
        }
        double totalCost = baseRental + optionsCost + surcharge;

        System.out.println("--- Rental Summary ---");
        System.out.println("Pickup Date: " + pickUpDate);
        System.out.println("Rental Days: " + nrOfDays);
        System.out.printf("Base Rental: $%.2f%n", baseRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", surcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);





    }



}
