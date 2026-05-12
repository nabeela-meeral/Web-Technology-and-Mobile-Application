package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {

 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  HttpSession session = request.getSession(false);

  if (session != null) {
   String user = (String) session.getAttribute("user");
   out.println("<h2>User Profile</h2>");
   out.println("Welcome " + user);
  } else {
   out.println("Session expired!");
  }
 }
}
