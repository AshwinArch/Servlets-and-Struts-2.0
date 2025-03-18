package com.ash;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	Connection con=null;
	public void init() throws ServletException
	{
		ServletConfig config=getServletConfig();
		String classname=config.getInitParameter("cn");
		String pwd=config.getInitParameter("pwd");
		String user=config.getInitParameter("user");
		String url=config.getInitParameter("url");
		    try
			{
				Class.forName(classname);
			}
		    catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			try
			{
				con=DriverManager.getConnection(url, user, pwd);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
	}
	public void destroy() 
	{
		try
		{
			if(con!=null)
			{
				con.close();
				con=null;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
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
		String uid=request.getParameter("un");
		String pwd=request.getParameter("pw");
		String sql="select * from users where username = '"+uid+"' and password = '"+pwd+"'";
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		boolean status=false;
		Statement stmt=null;
		try
		{
			stmt=con.createStatement();
			status=stmt.executeQuery(sql).next();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (stmt!=null)
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
		if(status)
		{
			out.println("Login Success!");
		}
		else
		{
			out.println("Login Failed!");
			out.println("<a href='login1.html'>Try again</a>");
		}
	}
}
