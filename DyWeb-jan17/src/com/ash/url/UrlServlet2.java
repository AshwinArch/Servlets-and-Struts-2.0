package com.ash.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UrlServlet2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String s1=request.getParameter("param1");
		String s2=request.getParameter("param2");
		PrintWriter out=response.getWriter();
		out.println("Param1 :"+s1+"<br>");
		out.println("Param2 :"+s2+"<br>");
	}
}
