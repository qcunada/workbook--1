package week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class WorkbookConnectingDB {
    public static void main(String[] args) {
        homeScreen(args);
    }
    public static void homeScreen(String[] args){
       boolean run = true;
       while (run) {

           Scanner scanner = new Scanner(System.in);
           System.out.println("What do you want to do? ");
           System.out.println("1) Display all products");
           System.out.println("2) Display all customers");
           System.out.println("3) Display all categories");
           System.out.println("0) exit");
           System.out.println("Select an option: ");

           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice) {
               case 1:
                   displayAllProducts(args);
                   break;
               case 2:
                   displayAllCustomers(args);
                   break;
               case 3:
                    displayAllCategories(args);
                    break;
               case 0:
                   System.out.println("exiting the app.");
                   run = false;
                   break;
               default:
                   System.out.println("invalid option.");
           }
       }




    }
    public static void displayAllProducts(String[] args){
        //String userInput = getUserInput();

        //check if args has 2 params
        if(args.length != 2){
            System.out.println("need 2 params.");
        }

        //set username and password
        String username = args[0];
        String password = args[1];


        // get connection
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",username,password)) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT productID, productName, UnitPrice, UnitsInStock\n" +
                    " FROM northwind.Products;");


            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {


                Double unitPrice= rs.getDouble("unitPrice");
                String productName = rs.getString("productName");
                int unitsInStock = rs.getInt("unitsInStock");
                int productID = rs.getInt("productID");
                System.out.println("Product Name: " + productName +"\nProduct ID: " + productID + "\nUnit Price:  " + unitPrice +  "\nStock: " + unitsInStock + "\n-----------------------------");


            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void displayAllCustomers(String[] args){
        if(args.length != 2){
            System.out.println("need 2 params.");
        }

        //set username and password
        String username = args[0];
        String password = args[1];


        // get connection
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",username,password)) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ContactName, CompanyName, City, Country, Phone FROM northwind.Customers;");


            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {


               String contactName = rs.getString("contactName");
                String companyName = rs.getString("companyName");
                String city = rs.getString("city");
                String country = rs.getString("country");
                String phone = rs.getString("phone");
                System.out.println("Contact Name: " + contactName +"\nCompany Name: " + companyName + "\nCity:  " + city +  "\nCountry: " + country + "\nphone #: " + phone + "\n-----------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void displayAllCategories(String[] args) {
        if (args.length != 2) {
            System.out.println("need 2 params.");
        }

        //set username and password
        String username = args[0];
        String password = args[1];


        // get connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password)) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT CategoryID, CategoryName FROM northwind.Categories;");


            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {


               int categoryID = rs.getInt("categoryID");
               String categoryName = rs.getString("categoryName");
                System.out.println("CategoryID: " + categoryID + "\nCategory Name: " + categoryName  + "\n-----------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        promptUser(args);
    }
    public static void promptUser(String[] args) {
       int userInput = Integer.parseInt(getUserInput());

        if (args.length != 2) {
            System.out.println("need 2 params.");
        }

        //set username and password
        String username = args[0];
        String password = args[1];


        // get connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password)) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT C.CategoryID, C.CategoryName, P.ProductID, P.ProductName, P.UnitPrice, P.UnitsInStock \n" +
                    "FROM northwind.Categories as C\n" +
                    "JOIN Products as P ON C.CategoryID = P.CategoryID\n" +
                    "WHERE C.CategoryID = ?;");
            preparedStatement.setInt(1, userInput );


            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {


                int categoryID = rs.getInt("categoryID");
                String categoryName = rs.getString("categoryName");
                int productID = rs.getInt("productID");
                String productName = rs.getString("productName");
                double unitPrice = rs.getDouble("unitPrice");
                int unitsInStock = rs.getInt("unitsInStock");
                System.out.println("CategoryID: " + categoryID + "\nCategory Name: " + categoryName + "\nProductName: " + productName + "\nProductID: " + productID + "\nUnit Price: " + unitPrice +"\nUnits in stock: " + unitsInStock + "\n-----------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
        public static String getUserInput () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Category ID to show products: ");
            return scanner.nextLine();
        }

    }


