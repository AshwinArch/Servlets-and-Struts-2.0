package Sysdate;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import class3.util;
import ash.com.Util;
/**
 * @author Ashwin
 */
public class A00
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=Util.getConnection();
			stmt=con.createStatement();
			String sql="insert into tab100 values(1, 'abc', sysdate)";
			stmt.executeUpdate(sql);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(null, stmt, con);
		}
	}
}
