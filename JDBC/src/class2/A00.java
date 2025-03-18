package class2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
			stmt=con.createStatement();
			boolean status=stmt.execute("create table test1(sno int, name varchar(30))");
			System.out.println(status);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
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
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			} 
			catch (Exception e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
