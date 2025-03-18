package com.ash.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookieServlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String s1=request.getParameter("param1");
		PrintWriter out=response.getWriter();
		out.println(s1);
		Cookie c=new Cookie("param1", s1);
		response.addCookie(c);
		out.println("<html><form action='cs2' method='post'><br>");
		out.println("Param2 : <input type='text' name='param2'><br>");
		out.println("<input type='submit' value='submit'></form></html>");
	}
}
