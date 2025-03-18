package ash.com;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ListIterator;
/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args)
	{
		Connection con= null;
		Statement stmt=null;
		try
		{
			con=Util.getConnection();
			stmt=con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("insert into test1 values (12, 'ashwin')");
			stmt.executeUpdate("insert into test1 values (13, 'hello')");
			con.commit();
			System.out.println("Commit");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		try
		{
			if(con!=null)
			{
				con.rollback();
			}
		} 
		catch (SQLException e2)
		{
			e2.printStackTrace();
			// TODO: handle exception
		}
		}
		finally
		{
			Util.closedDbResources(null, stmt, con);
		}
		
	}
}
