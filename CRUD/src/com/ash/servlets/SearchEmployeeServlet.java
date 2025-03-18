package com.ash.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ash.db.dao.EmployeeDAO;

/**
 * Servlet implementation class SearchEmployeeServlet
 */
public class SearchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=(Connection)request.getAttribute("con");
		Map<String, String[]> params=request.getParameterMap();
		ArrayList<HashMap<String, String>> records=EmployeeDAO.searchRecords(con, params);
		PrintWriter out=response.getWriter();
		if(records.size()>0)
		{
			out.println("Search ResultSet Records:"+records.size());
			out.println("<table border='2'>");
			out.println("<tr><th>SNO</th>");
			out.println("<th>FirstName</th>");
			out.println("<th>LastName</th>");
			out.println("<th>Age</th>");
			out.println("</tr>");
			int count=1;
			String id, firstName, lastName, age;
			for(HashMap<String, String> record : records)
			{
				id=record.get("id");
				firstName=record.get("firstName");
				lastName=record.get("lastName");
				age=record.get("age");
				out.println("<tr><td><a href='readEmp.do?id="+id+"',>"+ count++ +"</a></td>");
				out.println("<td>"+firstName+"</td>");
				out.println("<td>"+lastName+"</td>");
				out.println("<td>"+age+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		}
		else
		{
			out.println("No Records Found");
		}
		out.println("<br><a href='services.html'>Home<br>");
	}
}
