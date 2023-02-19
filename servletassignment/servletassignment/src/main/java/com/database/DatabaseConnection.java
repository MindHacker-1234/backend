package com.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/registration";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Praneeth@1618";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.err.println("Error while connecting to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error while loading the driver: " + e.getMessage());
        }
        return connection;
    }

    public static void insertUser(User user) {
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO form (firstname, lastname, location, phno) VALUES (?, ?, ?, ?)");
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getLocation());
            ps.setString(4, user.getPhno());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();

        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM form");

            while (resultSet.next()) {
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String location = resultSet.getString("location");
                String phno = resultSet.getString("phno");

                User user = new User(firstName, lastName, location, phno);
                users.add(user);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
