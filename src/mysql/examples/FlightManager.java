package mysql.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManager {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/FlightManager?"
                    + "user=root&password=coddingnomads"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("UPDATE FlightManager.ticket " +
                    "SET current_country = ? WHERE passenger_id = ?");
            preparedStatement.setString(1, "Germany");
            preparedStatement.setInt(2, 3);
            preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
