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
import com.ash.db.pool.connectionPool;
public class EditEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			Connection con=(Connection)request.getAttribute("con");
			String id=request.getParameter("id");
			HashMap<String, String> record=EmployeeDAO.readRecord(con, id);
			PrintWriter out=response.getWriter();
			out.println("<form action = 'editEmp.do' >");
			out.println("First Name:");
			out.println("<input type='text' name = 'firstname' value = '"+record.get("first_name")+"' ><br>");
			out.println("Last Name:");
			out.println("<input type='text' name = 'lastname' value = '"+record.get("last_name")+"' ><br>");
			out.println("Age:");
			out.println("<input type='text' name = 'lastname' value = '"+record.get("age")+"' ><br>");
			out.println("<input type='submit' value='save'>");
			out.println("<input type='hidden' name = '+id+' value = "+record.get("id")+"'>");
			out.println("</form>");
			out.println("<a href = 'services.html' >Home<br>");

	}
}
