package mysql.labs;

import java.sql.*;

public class Passengers {
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    public static void main(String[] args) {
        //uncomment the methods to execute queries
//        createPassenger();
//        queryPassenger();
//        updatePassenger();
        deletePassenger();

    }

    public static void createPassenger(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/FlightManager?"
                    + "user=root&password=coddingnomads"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("INSERT INTO FlightManager.passenger " +
                    "(first_name, last_name, email, age) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, "Hannah");
            preparedStatement.setString(2, "Miles");
            preparedStatement.setString(3, "HannahMiles@gmail.com");
            preparedStatement.setInt(4, 26);
            preparedStatement.executeUpdate();

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

    public static void queryPassenger(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String stringConnection = "jdbc:mysql://localhost/FlightManager?"
                    + "user=root&password=coddingnomads"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(stringConnection);
            preparedStatement = connection.prepareStatement("SELECT * FROM FlightManager.passenger " +
                    "WHERE first_name = ?");
            preparedStatement.setString(1, "kelvin");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int passenger_id = resultSet.getInt("passenger_id");
                String fName = resultSet.getString("first_name");
                String lName = resultSet.getString("last_name");

                System.out.println("The passenger with the id of " + passenger_id +" is called " + fName + " " +lName );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updatePassenger(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String stringConnection = "jdbc:mysql://localhost/FlightManager?"
                    + "user=root&password=coddingnomads"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(stringConnection);
            preparedStatement = connection.prepareStatement("UPDATE FlightManager.passenger " +
                    "SET age = ? where passenger_id = ?");
            //here parameter index 1 is age and x is value of age
            preparedStatement.setInt(1, 26);
            //here parameter index 2 is passenger_id x is id number
            preparedStatement.setInt(2, 22);
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

    public static void deletePassenger(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String stringConnection = "jdbc:mysql://localhost/FlightManager?"
                    + "user=root&password=coddingnomads"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(stringConnection);
            preparedStatement = connection.prepareStatement("DELETE FROM FlightManager.passenger " +
                    "WHERE first_name = ?");
            preparedStatement.setString(1, "kelvin");
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
