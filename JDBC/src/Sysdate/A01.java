package Sysdate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import class3.util;
/**
 * @author Ashwin
 */
public class A01
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=util.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from tab100");
			while(rs.next())
			{
				System.out.println(rs.getString("joining_date"));
				Date date=rs.getDate("joining_date");
				System.out.println(date);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			util.closeAllResources(rs, stmt, con);
		}
	}
}
