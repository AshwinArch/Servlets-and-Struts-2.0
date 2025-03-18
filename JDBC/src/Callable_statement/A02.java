package Callable_statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import class3.util;
/**
 * @author Ashwin
 */
public class A02
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=util.getConnection();
			cstmt=con.prepareCall("{call p4(4000, 'test')}");
			cstmt.execute();
			System.out.println("done");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			util.closeAllResources(null, cstmt, con);
		}
	}
}
