package week10.wednesday.DAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LanguageDao {
    private DataSource dataSource;

    public LanguageDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Language> getAllLanguages(){
        List<Language> languageList = new ArrayList<>();

        try(
                Connection connection =dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT language_id, name FROM language");
                ResultSet resultSet = preparedStatement.executeQuery()
                ){
            while (resultSet.next()){
                languageList.add(new Language(resultSet.getInt("language_id"), resultSet.getString("name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return languageList;

    }
    public Language getLanguageById(int id){
        try(
                Connection connection =dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT language_id, name FROM language");
                ResultSet resultSet = preparedStatement.executeQuery()
        ){
            while (resultSet.next()){
                //languageList.add(new Language(resultSet.getInt("language_id"), resultSet.getString("name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;//languageList;

    }
}
