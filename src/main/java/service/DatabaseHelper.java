package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
    private final String SERVER_ADDRESS = "127.0.0.1:5432";
    private final String DBNAME = "cw9";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "b00r1h00m";
    private Connection connection;

    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:postgresql://" + SERVER_ADDRESS + "/" + DBNAME, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}