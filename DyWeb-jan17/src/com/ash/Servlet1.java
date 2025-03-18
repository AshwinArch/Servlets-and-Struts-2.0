package com.ash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("param1");
		PrintWriter out=response.getWriter();
		out.println(s1);
		out.println("<form action='serv2'>");
		out.println("param2: <input type='text' name='param2'><br>");
		out.println("<input type='submit' value='submit' ></form>");
	}
}
