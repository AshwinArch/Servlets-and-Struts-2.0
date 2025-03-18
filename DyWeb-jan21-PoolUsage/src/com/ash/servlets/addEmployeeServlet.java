package com.ash.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ash.db.dao.EmployeeDAO;
public class addEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection con=(Connection)request.getAttribute("con");
		Map<String, String[]> params=request.getParameterMap();
		int status=EmployeeDAO.insertEmp(con, params);
		PrintWriter out=response.getWriter();
		if(status==1)
		{
			out.println("Successfully Inserted<br>");
		}
		else
		{
			out.println("DB error while inserting into Database<br>");
			out.println("<a href='services.html'>Home</a><br>");
		}
		out.println("<a href='services.html'>Home<br>");
	}
}
