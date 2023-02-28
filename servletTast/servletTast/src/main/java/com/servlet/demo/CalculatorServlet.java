package com.servlet.demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws IOException {


            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");


            int result;
            String message;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    message = "The sum of " + num1 + " and " + num2 + " is " + result;
                    break;
                case "subtract":
                    result = num1 - num2;
                    message = "The difference between " + num1 + " and " + num2 + " is " + result;
                    break;
                case "multiply":
                    result = num1 * num2;
                    message = "The product of " + num1 + " and " + num2 + " is " + result;
                    break;
                case "divide":
                    if (num2 == 0) {
                        message = "Cannot divide by zero";
                    } else {
                        result = num1 / num2;
                        message = "The quotient of " + num1 + " divided by " + num2 + " is " + result;
                    }
                    break;
                default:
                    message = "Invalid operation";
                    break;
            }


            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Calculator Result</title></head><body>");
            out.println("<h2>" + message + "</h2>");
            out.println("</body></html>");
        }
    }

