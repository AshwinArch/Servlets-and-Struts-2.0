package class2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Ashwin
 */
public class A08
{
	public static void main(String[] args)
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
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from tab10");
			while (rs.next())
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
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
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			} 
			catch (Exception e2)
			{
				e2.printStackTrace();
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
			catch (Exception e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
