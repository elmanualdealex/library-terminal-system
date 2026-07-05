package com.elmanualdealex;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private static final String URL = "jdbc:postgresql://localhost:5432/library";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}