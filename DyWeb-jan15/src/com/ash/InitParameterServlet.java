package com.ash;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class InitParameterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		Enumeration<String> names=config.getInitParameterNames();
		String name, value;
		while(names.hasMoreElements())
		{
			name=names.nextElement();
			value=config.getInitParameter(name);
			out.println(name+" : "+value+"<br>");
		}
	out.close();
	}
}
