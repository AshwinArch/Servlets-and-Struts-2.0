package com.headers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Servlet10
 */
public class Servlet10 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Enumeration<String> headers=request.getHeaderNames();
		String name, value;
		PrintWriter out=response.getWriter();
		while(headers.hasMoreElements())
		{
			name=headers.nextElement();
			value=request.getHeader(name);
			out.println(name+" : "+value+" : "+"<br>");
		}
	}
}
