package com.ash.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ash.db.dao.EmployeeDAO;
public class ReadEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con=(Connection)request.getAttribute("con");
		String id=request.getParameter("id");
		HashMap<String, String> record=EmployeeDAO.readRecord(con, id);
		PrintWriter out=response.getWriter();
		out.println("<table border='1'>");
		out.print("<tr><td>FirstName</td>");
		out.println("<td>"+record.get("firstName")+"</td>");
		out.println("</tr>");
		out.print("<tr><td>LastName</td>");
		out.println("<td>"+record.get("lastName")+"</td>");
		out.println("</tr>");
		out.print("<tr><td>Age</td>");
		out.println("<td>"+record.get("age")+"</td>");
		out.println("</tr>");
		out.print("<td><a href='readEmpforDelete.do?id="+record.get("id")+"'>Delete</a></td>");
		out.print("<td><a href='readEmpforEdit.do?id="+record.get("id")+"'>Edit</a></td>");
		out.println("<a href='services.html'>Home<br>");
	}

}
