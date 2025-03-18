package com.ash;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LifeCycleServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       public LifeCycleServlet() 
       {
        super();
        System.out.println("obj. created");
        // TODO Auto-generated constructor stub
       }
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("obj. initialize");// TODO Auto-generated method stub
	}
	public void destroy() 
	{
		System.out.println("obj. destroyed");// TODO Auto-generated method stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("From doGet()");
		doPerform(request, response);// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("From doPost()");
		doPerform(request, response);// TODO Auto-generated method stub
	}
	protected void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("From doPerform()");
		PrintWriter out=response.getWriter();
		out.println("I am from doPerform.");
	}
}
