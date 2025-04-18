package week2;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
         {
            Scanner scanner = new Scanner(System.in);



            System.out.println("Enter your Billing Address");
            StringBuilder billing = new StringBuilder();
             System.out.println("Enter your full name: ");
            billing.append(scanner.nextLine()).append("\n");
            System.out.println("Street: ");
            billing.append(scanner.nextLine()).append("\n");
            System.out.println("City: ");
            billing.append(scanner.nextLine()).append(", ");
            System.out.println("State: ");
            billing.append(scanner.nextLine()).append(" ");
            System.out.println("Zip");
            billing.append(scanner.nextLine()).append(" ");

             System.out.println("Enter your Shipping Address");
            StringBuilder shipping = new StringBuilder();
             System.out.println("Street: ");
             shipping.append(scanner.nextLine()).append("\n");
             System.out.println("City: ");
             shipping.append(scanner.nextLine()).append(", ");
             System.out.println("State: ");
             shipping.append(scanner.nextLine()).append(" ");
             System.out.println("Zip");
             shipping.append(scanner.nextLine()).append(" ");


            System.out.println("Billing address: \n" +billing.toString());
            System.out.println();
            System.out.println("Shipping address: \n" + shipping.toString());




    }


    }
}
