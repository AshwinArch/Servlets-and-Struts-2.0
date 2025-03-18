package com.ash;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet1
 */
public class RegistrationServlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPerform(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPerform(request, response);
	}
	protected void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String pw=request.getParameter("pw");
		String add=request.getParameter("add");
		String gen=request.getParameter("gender");
		String skills[]=request.getParameterValues("skills");
		String educ[]=request.getParameterValues("education");
		PrintWriter out=response.getWriter();
		out.println("Firstname : "+fn+"<br>");
		out.println("Lastname : "+ln+"<br>");
		out.println("Password : "+pw+"<br>");
		out.println("Address : "+add+"<br>");
		out.println("Gender : "+gen+"<br>");
		out.println("Skills : "+Arrays.toString(skills)+"<br>");
		out.println("Latest Educations : "+Arrays.toString(educ)+"<br>");
		out.close();
	}
}
