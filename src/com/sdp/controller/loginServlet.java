package com.sdp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/SDPJC";
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            if(connection != null) {
                response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp");
        } finally {
            if(connection != null) {
                try {
                    System.out.println("Connection closed.");
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    response.sendRedirect("login.jsp");
                }
            }
        }
/*        if(username.equals("foo") && password.equals("bar")) {

            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }*/
    }
}
