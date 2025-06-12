package week10;

import java.sql.*;
import java.util.Scanner;

public class ConnectingDB {
    public static void main(String[] args) throws SQLException {
        //Exercise 1: Find Customers by Company Name
        //Goal: Ask the user for a company name and display matching customers’ IDs and contact names.
        //
        //Requirements:
        //
        //Use LIKE in SQL
        //Use Scanner to get user input
        //Use a prepared statement
            String companyName = getUserInput();

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
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT CompanyName, CustomerID, contactName FROM northwind.Customers WHERE CompanyName LIKE ?");
            preparedStatement.setString(1,'%' + companyName + '%');



            ResultSet rs = preparedStatement.executeQuery();

                //process results
            while (rs.next()) {
               /* String productName = rs.getString("ProductName");
                double unitPrice = rs.getDouble("UnitPrice");
                int unitsInStock = rs.getInt("unitsInStock");
                int productID = rs.getInt("productID");
                System.out.println(("product Id: " + productID +"\nName: " + productName + "\nPrice: " + unitPrice + "\nStock: " + unitsInStock +"\n-----------------"));*/

                String customerID = rs.getString("CustomerID");
                String contactNames= rs.getString("contactName");
                System.out.println("Customer ID: " + customerID + "\nContact Name: " + contactNames);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Company Name: ");
        return scanner.nextLine();


    }
}
