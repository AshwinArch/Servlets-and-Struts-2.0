package class3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class util
{
	static 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
	}
	public static void closeAllResources(ResultSet rs, Statement stmt, Connection con)
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