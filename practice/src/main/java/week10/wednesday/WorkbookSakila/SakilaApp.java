package week10.wednesday.WorkbookSakila;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class SakilaApp {
    private static SakilaDataManager dataManager;

    public static void main(String[] args) {
        init(args);
        List<Actor> actors = dataManager.getAllActors();
        //actors.forEach(System.out::println);
    }
    public static void init(String[] args){
        String username = args[0];
        String password = args[1];
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/Sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataManager = new SakilaDataManager(dataSource);
    }
}
