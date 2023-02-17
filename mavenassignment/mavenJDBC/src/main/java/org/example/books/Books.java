package org.example.books;

import java.sql.SQLException;

public interface Books {
    public void insertbook();
        public void searchbook();

        public void deletebook();
        public void displaybook() throws SQLException;

}
