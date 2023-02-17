package org.example.booksiml;

import org.example.books.Books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;

public class BooksOperations implements Books {
    private static final String URL = "jdbc:mysql://localhost:3306/librarymanagement";
    private static final String username = "root";
    private static final String password = "Praneeth@1618";
    private static Connection conn;


    static {

        try {
            conn = DriverManager.getConnection(URL, username, password);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    public void insertbook() {
        try {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO libraryBooks (bookid, bookname, bookauthor, bookprice, bookdescription) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, 10);
            statement.setString(2, "wolverine");
            statement.setString(3, "stanlee");
            statement.setInt(4, 30);
            statement.setString(5, "fighting");
            statement.executeUpdate();
            System.out.println("Book inserted Successfully");
        } catch (SQLException e) {
            System.out.println("error inserting into table" + e.getMessage());
        }
    }

    public void searchbook() {
        try {
            PreparedStatement statement = conn.prepareStatement("select * from librarybooks where bookid = ?");
            statement.setInt(1, 1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("bookid" + rs.getInt(1));
                System.out.println("bookname" + rs.getString(2));
                System.out.println("bookauthor" + rs.getString(3));
                System.out.println("bookprice" + rs.getString(4));
                System.out.println("bookdescription" + rs.getString(5));

            }
        } catch (SQLException e) {
            System.out.println("Error searching book: " + e.getMessage());
        }
    }


    public void deletebook() {
        try {
            PreparedStatement statement = conn.prepareStatement("DELETE FROM libraryBooks WHERE bookid = ?");
            statement.setInt(1, 1);
            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " rows deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting book: " + e.getMessage());
        }
    }


    public void displaybook() {
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from librarybooks");
            while (rs.next()) {
                System.out.println("bookid" + rs.getInt(1));
                System.out.println("bookname" + rs.getString(2));
                System.out.println("bookauthor" + rs.getString(3));
                System.out.println("bookprice" + rs.getString(4));
                System.out.println("bookdescription" + rs.getString(5));
            }
        }catch(SQLException e){
            System.out.println("error displaying books" + e.getMessage());
        }
    }
}




