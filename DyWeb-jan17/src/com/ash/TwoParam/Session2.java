package com.ash.TwoParam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Session2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String s1=(String)session.getAttribute("param1");
		String s2=(String)session.getAttribute("param2");
		String s3=request.getParameter("param3");
		String s4=request.getParameter("param4");
		PrintWriter out=response.getWriter();
		out.println(s1+"<br>");
		out.println(s2+"<br>");
		out.println(s3+"<br>");
		out.println(s4);
	}
}
