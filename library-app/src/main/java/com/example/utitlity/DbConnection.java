package com.example.utitlity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String USER_NAME = "root";
    private static final String PASSWORD = "password";
    private static final String URL = "jdbc:mysql://localhost:3306/gbs";

    private static Connection dbConnection;

    private DbConnection() {

    }

    public static Connection getConnection() throws SQLException {
        if (dbConnection == null) {
            dbConnection = DbConnection.createConnection();
        }
        return dbConnection;
    }

    public static void closeConnection() throws SQLException{
        if (dbConnection != null) {
            dbConnection.close();
        }
    }

    private static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

}
