package com.HTTP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		HttpSession session=req.getSession();
		//session.removeAttribute("k"); //Used for removing the session value
		
		int k=(int)session.getAttribute("k");//it return object thats why we type cast
		
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is:" +k);
		
		System.out.print("Here We Are");
	}

}
