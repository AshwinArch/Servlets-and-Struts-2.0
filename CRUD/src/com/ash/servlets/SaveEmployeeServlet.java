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
public class SaveEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=(Connection)request.getAttribute("con");
		Map<String, String[]> params=request.getParameterMap();
		int status=EmployeeDAO.saveEmp(con, params);
		PrintWriter out=response.getWriter();
		if(status==1)
		{
			out.println("Updated Successfully");
		}
		else
		{
			out.println("DB Error");
		}
		out.println("<a href='services.html'>Home<br>");

	}

}
