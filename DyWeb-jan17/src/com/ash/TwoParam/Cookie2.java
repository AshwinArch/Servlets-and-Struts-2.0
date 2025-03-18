package com.ash.TwoParam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie2
 */
public class Cookie2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie all[]=request.getCookies();
//		Cookie c1=all[0];
//		Cookie c2=all[1];
		String s1=all[0].getValue();
		String s2=all[1].getValue();
		String s3=request.getParameter("param3");
		String s4=request.getParameter("param4");
		PrintWriter out=response.getWriter();
		out.println(s1+"<br>");
		out.println(s2+"<br>");
		out.println(s3+"<br>");
		out.println(s4);
	}

}
