package com.ash.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookieServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie all[]=request.getCookies();
		Cookie c1=all[0];
		String s1=c1.getValue();
		String s2=request.getParameter("param2");
		PrintWriter out=response.getWriter();
		out.println(s1+"<br>");
		out.println(s2);
	}
}
