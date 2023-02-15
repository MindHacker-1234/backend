package org.example;


import java.sql.*;


public class App
{
    public static void main( String[] args ) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "Praneeth@1618");

            PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO librarybooks (bookid, bookname, bookauthor, bookprice, bookdescription) VALUES (?, ?, ?, ?, ?)");
            insertStmt.setInt(1,8);
            insertStmt.setString(2, "The Great");
            insertStmt.setString(3, "willy");
            insertStmt.setInt(4, 30);
            insertStmt.setString(5, "human pride.");
            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new book has been inserted.");
            }

            PreparedStatement searchStmt = conn.prepareStatement("SELECT * FROM books WHERE bookid = ?");
            searchStmt.setInt(1, 5);
            ResultSet rs = searchStmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("bookid") + ", " + rs.getString("bookname") + ", " + rs.getString("bookauthor") + ", " + rs.getInt("bookprice") + ", " + rs.getString("bookdescription"));
            }

            Statement listStmt = conn.createStatement();
            ResultSet listRs = listStmt.executeQuery("SELECT * FROM librarybooks");
            System.out.println("All books in the table:");
            while (listRs.next()) {
                System.out.println(listRs.getInt("bookid") + ", " + listRs.getString("bookname") + ", " + listRs.getString("bookauthor") + ", " + listRs.getInt("bookprice") + ", " + listRs.getString("bookdescription"));
            }

            PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM librarybooks WHERE bookid = ?");
            deleteStmt.setInt(1, 1);
            int rowsDeleted = deleteStmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The book has been deleted.");
            }

            listRs = listStmt.executeQuery("SELECT * FROM librarybooks");
            System.out.println("All books in the table:");
            while (listRs.next()) {
                System.out.println(listRs.getInt("bookid") + ", " + listRs.getString("bookname") + ", " + listRs.getString("bookauthor") + ", " + listRs.getInt("bookprice") + ", " + listRs.getString("bookdescription"));
            }


            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
