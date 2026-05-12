package com.library;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  String fname = request.getParameter("fname");
  String lname = request.getParameter("lname");
  String email = request.getParameter("email");
  String password = request.getParameter("password");
  String mobile = request.getParameter("mobile");
  String address = request.getParameter("address");

  try {
   Class.forName("com.mysql.cj.jdbc.Driver");

   Connection con = DriverManager.getConnection(
   "jdbc:mysql://localhost:3306/librarydb","root","0000");

   PreparedStatement ps = con.prepareStatement(
   "INSERT INTO users VALUES(?,?,?,?,?,?)");

   ps.setString(1, fname);
   ps.setString(2, lname);
   ps.setString(3, email);
   ps.setString(4, password);
   ps.setString(5, mobile);
   ps.setString(6, address);

   ps.executeUpdate();

   out.println("<h2>Registration Successful</h2>");

   con.close();

  } catch(Exception e) {
   out.println(e);
  }
 }
}
