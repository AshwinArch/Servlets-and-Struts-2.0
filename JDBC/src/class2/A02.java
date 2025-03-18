package class2;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Ashwin
 *
 */
public class A02
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=DBUtil.getConnection();
			stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into test1 values(1, 'abc')");
			System.out.println(i);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			DBUtil.closeDbResources(null, stmt, con);
		}
	}
}
