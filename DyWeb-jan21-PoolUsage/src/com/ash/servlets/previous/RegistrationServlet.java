package com.ash.servlets.previous;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Connection con=(Connection)request.getAttribute("con");
			String firstname=request.getParameter("fn");
			String lastname=request.getParameter("ln");
			String username=request.getParameter("un");
			String password=request.getParameter("password");
			String sql="insert into users values(users_seq.nextval, '"+firstname+"','"+lastname+"','"+username+"','"+password+"')";
			System.out.println(sql);
			int status=0;
			Statement stmt=null;
			try
			{
				stmt=con.createStatement();
				status=stmt.executeUpdate(sql);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(stmt!=null)
					{
						stmt.close();
						stmt=null;
					}
				}
				catch (SQLException e2)
				{
					e2.printStackTrace();
				}
			}
			PrintWriter out=response.getWriter();
			if(status==1)
			{
				out.println("Registration Success!");
			}
			else
			{
				out.println("Registration Failed!");
			}
			out.println("<a href='services.html'>Home<br>");
	}
}