package week10.thursday;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShippersDao {
    private DataSource dataSource;

    public ShippersDao(DataSource dataSource) {
        this.dataSource = dataSource;

    }

    public List<Shipper> getAll() {

        // This is the query that I will run on the db later
        String query = "SELECT * FROM shippers";
        // This is the list that will be filling with all the records
        List<Shipper> shipperList = new ArrayList<>();


        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()
        ) {

            while (resultSet.next()) {
                shipperList.add(new Shipper(resultSet.getInt("ShipperID"), resultSet.getString("CompanyName"), resultSet.getString("Phone")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return shipperList;
    }

    public void add(Shipper shipper) {
        String query = "INSERT INTO shippers (CompanyName, Phone) VALUES (?,?);";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, shipper.getCompanyName());
            preparedStatement.setString(2, shipper.getPhone());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected != 1) {
                throw new SQLException("Insertion failed" + shipper);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void update(int id, Shipper shipper){
        String query = "Update shippers SET CompanyName = ?, Phone = ? WHERE ShipperId = ?;";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ){
            preparedStatement.setString(1,shipper.getCompanyName());
            preparedStatement.setString(2,shipper.getPhone());
            preparedStatement.setInt(3,id);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void delete(int id) {
        String query = "DELETE FROM shippers WHERE ShipperID = ?";
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public void printList(List<Shipper> shipperList) {
        for (Shipper shipper : shipperList) {
            System.out.println("Shipper ID: " + shipper.getShipperId());
            System.out.println(shipper.getCompanyName() + " - " + shipper.getPhone());
            System.out.println("----------------");
        }
    }
}
