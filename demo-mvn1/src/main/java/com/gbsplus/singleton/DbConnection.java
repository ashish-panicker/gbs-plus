package com.gbsplus.singleton;

public class DbConnection {

    private static DbConnection connection;

    private DbConnection() {
        System.out.println("DbConnection created");
    }

    public static DbConnection getInstance() {
        if (connection == null) {
            connection = new DbConnection();
        }
        return connection;
    }

    public void connect() {
        System.out.println("DbConnection connected");
    }

    public void disconnect() {
        System.out.println("DbConnection disconnected");
    }


}
