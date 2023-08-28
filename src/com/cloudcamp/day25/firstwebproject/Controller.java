//package com.cloudcamp.day25.project;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Controller extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String result = SampleProgramToReadFromDataBase.readStudentName();



    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h1>"+result+"</h1>");
    out.println("</body></html>");
  }


  // what is servlet

  // Learn what is HttpServlet

  // Learn what is Generic servlet

  // What is a filter

  // what is web.xml
}

