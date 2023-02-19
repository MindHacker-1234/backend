package com.servlets;

import com.database.DatabaseConnection;
import com.database.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String location = req.getParameter("location");
        String phno = req.getParameter("phno");

        User user = new User(firstname, lastname, location, phno);
        DatabaseConnection.insertUser(user);
        resp.sendRedirect("display.html");
    }
}

