package com.servlets;

import com.database.DatabaseConnection;
import com.database.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DisplayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = DatabaseConnection.getUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher("display.html").forward(req, resp);
    }
}
