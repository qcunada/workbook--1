package week10.thursday;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static ShippersDao shippersDAO;




    public static void HoneScreen(String[] args){
        init(args);
        boolean homeScreenRunning = true;
        try{
            while (homeScreenRunning){
                System.out.println("What would you like to do?");
                System.out.println("""
                        1. Display all Shippers.
                        2. add a new Shipper.
                        3. Change the Phone Number of a Shipper.
                        4. Delete the shipper.
                        0. Exit""");

                int userChoice = Integer.parseInt(scanner.nextLine().trim());

                switch (userChoice){
                    case 1 -> shippersDAO.printList(shippersDAO.getAll());
                    case 2 -> shippersDAO.add(getShipperInfo());

                    case 3 -> {
                        System.out.println("Please enter the shipper ID");
                        int shipperId = Integer.parseInt(scanner.nextLine().trim());
                        shippersDAO.update(shipperId,getShipperInfo());
                    }
                    case 4 -> {
                        System.out.println("Please enter the Shipper ID: ");
                        int shipperId = Integer.parseInt(scanner.nextLine().trim());
                        shippersDAO.delete(shipperId);
                    }
                    case 0 -> {
                        System.out.println("Bye");
                        homeScreenRunning = false;
                    
                    }
                    default -> System.out.println("Invalid input");
                }

            }
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void init(String[] args){
        if(args.length != 2){
            System.out.println("need 2 args");
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource. setPassword(password);
        shippersDAO = new ShippersDao(dataSource);
    }
    public static Shipper getShipperInfo(){
        Shipper shipper = new Shipper();

        System.out.println("Enter the company name: ");
        String companyName = scanner.nextLine().trim();

        System.out.println("Please enter the company Phone number: ");
        String phone = scanner.nextLine().trim();

        shipper.setCompanyName(companyName);
        shipper.setPhone(phone);
        return shipper;
    }

}