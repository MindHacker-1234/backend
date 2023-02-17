package org.example;

import org.example.booksiml.BooksOperations;

import java.sql.*;
public class App {
    public static void main(String[] args) {
        BooksOperations b = new BooksOperations();
        b.deletebook();
        b.displaybook();
        b.insertbook();
        b.searchbook();
    }
}