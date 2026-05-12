package com.dispatcher;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

  String name = request.getParameter("username");

  request.setAttribute("user", name);

  RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
  rd.forward(request, response);
 }
}
