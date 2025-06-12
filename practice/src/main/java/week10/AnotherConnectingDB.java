package week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AnotherConnectingDB {
    public static void main(String[] args) {
        //Exercise 4: Top Products in a Category (JOIN + Filtering)
        //Goal: Ask the user for a category name and show the top 5 most expensive products in that category.
        //
        //Requirements:
        //
        //JOIN Products with Categories
        //Use Scanner, PreparedStatement
        //Use ORDER BY and LIMIT

        String userInput = getUserInput();

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
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT  P.ProductName, C.CategoryName, UnitPrice FROM northwind.Products as P\n" +
                    "JOIN Categories as C ON P.CategoryID = C.CategoryID\n" +
                    "WHERE C.CategoryName LIKE ?\n" +
                    "ORDER BY UnitPrice DESC\n" +
                    "LIMIT 5;");
            preparedStatement.setString(1,'%' + userInput + '%');


            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {

                String categoryName = rs.getString("categoryName");
                Double unitPrice= rs.getDouble("unitPrice");
                String productName = rs.getString("productName");
                System.out.println("Product Name: " + productName + "\nUnit Price:  " + unitPrice + "   |   Category Name: " + categoryName + "\n------------------------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Category Name: ");
        return scanner.nextLine();


    }


}
