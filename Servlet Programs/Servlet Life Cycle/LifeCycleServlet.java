package com.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {

 public void init() throws ServletException {
  System.out.println("Servlet Initialized");
 }

 protected void service(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  out.println("<h2>Service Method Executed</h2>");
 }

 public void destroy() {
  System.out.println("Servlet Destroyed");
 }
}
