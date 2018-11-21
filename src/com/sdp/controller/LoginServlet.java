package com.sdp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import static com.sdp.Constants.JDBC_DRIVER;
import static com.sdp.Constants.JDBC_URL;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {



//  Redirects to the login.jsp when the servlet is called.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);

    }

    /*
     * TODO: Create the profile page redirection.
     * Receives a request from login.jsp and proceeds to
     * retrieve the username and password from the inputs.
     * Tests if the users are valid for connection with the
     * database. If it is, it will redirect to another page.
     * If it is not, if will redirect to the login page.
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").toLowerCase();
        String password = request.getParameter("password");
        Connection connection = null;
        HttpSession session = request.getSession(false);

        /*
        * TODO: Debug the session to check if the user is already logged in.
        * Checks if the user has already logged in. If the user
        * is already logged in, it will redirect to another page.
        * */
/*        if(session != null) {
            String usernames = (String)session.getAttribute("username");
            request.setAttribute("outString", session);
            request.getRequestDispatcher("WEB-INF/jsp/outJSP.jsp").forward(request, response);
        }

        else {*/
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(JDBC_URL, username, password);
                if(connection != null) {
                    connection.close();
                    session = request.getSession();
                    session.setAttribute("username", username);
                    session.setAttribute("password", password);
                    request.setAttribute("outString","Welcome" + username);
                    request.getRequestDispatcher("WEB-INF/jsp/outJSP.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
    }
}
