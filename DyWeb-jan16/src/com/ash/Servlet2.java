package com.ash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("param1");
		String s2=(String)request.getAttribute("result");
		System.out.println("From Servlet2 : "+s1);
		System.out.println("From Servlet2 : "+s2);
		PrintWriter out=response.getWriter();
		out.println("From Servlet2: "+s1+"<br>");
		out.println("From Servlet2: "+s2+"<br>");
	}

}
