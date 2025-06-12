package week10.wednesday.WorkbookSakila;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SakilaDataManager {
    private DataSource dataSource;
    private static Scanner scanner = new Scanner(System.in);

    public SakilaDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public List<Actor> getAllActors(){

        Actor actor = getUserInput();

        List<Actor> actors = new ArrayList<>();
        String sql = "SELECT actor_id, first_name, last_name FROM sakila.actor\n" +
                "WHERE first_name = ? and last_name = ?;";




        try(Connection connection= dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());


            try(ResultSet rs = preparedStatement.executeQuery()) {


                while (rs.next()) {
                    int actorId = rs.getInt("actor_id");
                    String firstname = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    //Actor actor = new Actor(actorId,firstname,lastName);
                    actors.add(actor);
                    System.out.println("Actor ID: " + actorId + "\nFirst Name: " + firstname + "\nLast Name: " + lastName + "\n-----------------------------");

                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        getAllFilm();
        return actors;
    }
    public static Actor getUserInput(){
        Actor actor = new Actor();

        System.out.println("What is the first name of the actor?");
        actor.setFirstName(scanner.nextLine());
        System.out.println("What is the last name of the actor?");
        actor.setLastName(scanner.nextLine());
        return actor;


    }
    public List<Actor> getAllFilm(){

        Actor actor = getFilm();

        List<Actor> actors = new ArrayList<>();
        String sql = "SELECT A.actor_id, first_name, last_name, title, `description`, release_year, length  FROM sakila.actor as A\n" +
                "JOIN film_actor as FA ON A.actor_id = FA.actor_id\n" +
                "JOIN film as F ON F.film_id = FA.film_id\n" +
                "WHERE A.actor_id = ?;";




        try(Connection connection= dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, String.valueOf(actor.getActorId()));



            try(ResultSet rs = preparedStatement.executeQuery()) {


                while (rs.next()) {
                    int actorId = rs.getInt("actor_id");
                    String title = rs.getString("title");
                    String description = rs.getString("description");
                    int year = rs.getInt("release_year");
                    int length = rs.getInt("length");
                    String firstname = rs.getString("first_name");
                    String lastName = rs.getString("last_name");

                    actors.add(actor);
                    System.out.println("Actor ID: " + actorId + "\nFirst Name: " + firstname + "\nLast Name: " + lastName + "\nTitle: " + title + "\nRelease year: " + year + "\nDescription: "+ description + "\n---------------------------------");

                }
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return actors;
    }
    public static Actor getFilm(){
       Actor actor = new Actor();

        System.out.println("What is the Actor's Actor ID?");
        actor.setActorId(Integer.parseInt(scanner.nextLine()));

        return actor;


    }
}
