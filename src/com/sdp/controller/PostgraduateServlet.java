package com.sdp.controller;

import com.sdp.model.Postgraduate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.sdp.Constants.*;

@WebServlet(name = "PostgraduateServlet", urlPatterns = "/postgraduate")
public class PostgraduateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


    /*
     * TODO: Improve the documentation on the postgraduate servlet.
     * TODO: Improve the response time on the postgraduate servlet.
     * TODO: Check the response time on the postgraduate servlet.
     * Constructs a list of postgrads and a postgraduate.
     * Establishes a connection with the database, then, proceeds to
     * execute a query in which the data from the Postgraduate table is retrieved.
     * After this, the postgraduate is appended to the list, until the retrieval is over.
     * Finally, the contents of the list is forwarded to the postgraduate.jsp file and
     * closes off the connection with the database.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        String query = "select pgradID, pgradName from Postgraduate";
        List<Postgraduate> postgrads = new ArrayList<>();
        Postgraduate postgraduate;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, SDPJC_USER, SDPJC_PASS);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                postgraduate = new Postgraduate(rs.getInt(1), rs.getString(2));
                postgrads.add(postgraduate);
            }
            rs.close();
            request.setAttribute("postgrads", postgrads);
            request.getRequestDispatcher("postgraduate.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
