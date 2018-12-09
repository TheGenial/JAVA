package com.sc1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k=(int) req.getAttribute("k");// Return object so that we type cast
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("The Result is:" +k);
		
	}

}
