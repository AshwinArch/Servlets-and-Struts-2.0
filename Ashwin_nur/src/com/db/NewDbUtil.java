/**
 * 
 */
package com.db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Ashwin
 *
 */
public class NewDbUtil
{
	private static String className;
	private static String url;
	private static String user;
	private static String password;
	static
	{
		try
		{
			Properties pr=new Properties();
			pr.load(new FileReader("db-constant.properties"));
			className=pr.getProperty("className");
			url=pr.getProperty("url");
			user=pr.getProperty("user");
			password=pr.getProperty("password");
			
		} catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	static 
	{
		try
		{
			Class.forName(className);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
		public static Connection getConnection()throws SQLException
		{
			return DriverManager.getConnection(url, user, password);
		}
		public static void closeAllResources(ResultSet rs,Statement stmt, Connection con )
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs=null;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				// TODO: handle exception
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
				// TODO: handle exception
			}
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
				// TODO: handle exception
			}
		}
	}
