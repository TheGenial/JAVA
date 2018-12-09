package com.arif;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Step 1: Set the content type
        response.setContentType("text/html");

        //Step 2: Get the printwritter
        PrintWriter out = response.getWriter();

        //Step 3: Generate HTML Content
        out.println("<html><body>");
        out.println("Hellow World<br>");
        out.println("Servlet Test at:" +request.getContextPath());
        out.println("<br>Time on the server:" +new java.util.Date());
        out.println("</body></html>");
    }
}
