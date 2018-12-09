package com.arif;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "HelloServlet",urlPatterns = "/a")
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //Step 1: Set the content type
            response.setContentType("text/html");

        //Step 2: Get the printwritter
            PrintWriter out = response.getWriter();

        //Step 3: Generate HTML Content
            out.println("<html><body>");
            out.println("Hellow World");
            out.println("<hr>");
            out.println("Time on the server:" +new java.util.Date());
            out.println("</body></html>");

    }
}
