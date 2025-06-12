package week10;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DataSourceSakila {
    public static void main(String[] args) {

        //check if args has 2 params
        if (args.length != 2) {
            System.out.println("need 2 params.");
        }

        //set username and password
        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        doSimpleQuery(dataSource);
    }
    private static void doSimpleQuery(DataSource dataSource) {
        String lastNameInput = getUserInput();

        // get connection
        try(Connection connection = dataSource.getConnection()) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT first_name, last_name FROM sakila.actor\n" +
                    "WHERE last_name = ?;");
            preparedStatement.setString(1,lastNameInput);



            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {

                String lastName = rs.getString("last_name");
                String firstName= rs.getString("first_name");
                System.out.println("First: " + firstName + "\nLast: " + lastName + "\n------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        doAnotherSimpleQuery(dataSource);
    }
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last Name of Actor: ");
        return scanner.nextLine();


    }
    private static void doAnotherSimpleQuery(DataSource dataSource) {
        String firstNameInput = getFirstNameInput();
        String lastNameInput = getLastNameInput();

        // get connection
        try(Connection connection = dataSource.getConnection()) {


            //run query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT first_name, last_name, F.title, F.release_year FROM sakila.actor as A\n" +
                    "JOIN film_actor as FA ON A.actor_id = FA.actor_id\n" +
                    "JOIN film as F ON F.film_id = FA.film_id\n" +
                    "WHERE first_name = ? and last_name = ? ;");
            preparedStatement.setString(1,firstNameInput);
            preparedStatement.setString(2,lastNameInput);



            ResultSet rs = preparedStatement.executeQuery();

            //process results
            while (rs.next()) {

                String lastName = rs.getString("last_name");
                String firstName= rs.getString("first_name");
                String title = rs.getString("title");
                int year = rs.getInt("release_year");
                System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nMovie played in: "+ title + "\nYear: " + year + "\n---------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public static String getFirstNameInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name of Actor: ");
        return scanner.nextLine();


    }
    public static String getLastNameInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last Name of Actor: ");
        return scanner.nextLine();


    }


}
