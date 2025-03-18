package com.ash.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ash.db.dao.EmployeeDAO;
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=(Connection)request.getAttribute("con");
		String id=request.getParameter("id");
		int status=EmployeeDAO.deleteRecord(con, id);
		PrintWriter out=response.getWriter();
		if(status==1)
		{
			out.println("Delete Successfully");
		}
		else
		{
			out.println("DB error while deleting");
		}
		out.println("<a href='services.html'>Home<br>");
	}
}
