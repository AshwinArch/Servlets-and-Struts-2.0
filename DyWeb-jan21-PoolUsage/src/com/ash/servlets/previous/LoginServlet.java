package com.ash.servlets.previous;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=(Connection)request.getAttribute("con");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sql="select * from users where username='"+username+"'and password='"+password+"'";
		System.out.println(sql);
		boolean status=false;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			status=rs.next();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs=null;
				}
			} 
			catch (SQLException e2)
			{
				e2.printStackTrace();
			}
		}
		try
		{
			if(stmt!=null)
			{
				stmt.close();
				stmt=null;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		if(status)
		{
			request.getRequestDispatcher("services.html").forward(request, response);
		}
		else
		{
			out.println("Login Is Failed!");
			out.println("<a href=\"login.html\">try again<br>");
		}
		out.println("<a href='services.html'>Home<br>");

	}

}
