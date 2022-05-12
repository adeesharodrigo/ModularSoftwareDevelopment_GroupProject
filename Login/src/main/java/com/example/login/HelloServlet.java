package com.example.login;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {

            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false", "root", "Lazaruz1@");) {
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from login where username='" +username + "' and password='" +password+ "'");
                if (rs.next()) {
                    response.sendRedirect("home.html");
                }else {
                    System.out.println("Wrong User Name");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

