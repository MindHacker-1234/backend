package com.servlets;

import com.database.DatabaseConnection;
import com.database.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class UserFilter implements Filter {



    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        List<User> users = DatabaseConnection.getUsers();
        boolean isUserExists = false;
        for (User user : users) {
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) {
                isUserExists = true;
                break;
            }
        }

        if (!isUserExists) {
            try {
                response.sendRedirect("display.jsp");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }


    public void destroy() {

    }
}
