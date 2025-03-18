package com.ash;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	 private Connection conn=null;
      public LoginServlet1()
      {
        super();
	 }
    public void init() throws ServletException
    {
    	  ServletContext context=getServletContext();
    	  String classname=context.getInitParameter(JdbcAttribute.classname);
    	  String url=context.getInitParameter(JdbcAttribute.url);
    	  String pwd=context.getInitParameter(JdbcAttribute.password);
    	  String user=context.getInitParameter(JdbcAttribute.username);
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
			conn=DriverManager.getConnection(url, user, pwd);
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
			if(conn!=null)
			{
				conn.close();
				conn=null;
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
		String sql="select * from users where username='"+uid+"' and password='"+pwd+"'";
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		boolean status=false;
		Statement stmt=null;
		try
		{
			stmt=conn.createStatement();
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