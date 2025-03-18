/**
 * 
 */
package class2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * @author Ashwin
 *
 */
public class A05
{
	public static void main(String[] args)
	{
		Connection con=null;
		try
		{
			con=NewDbUtil.getConnection();
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			NewDbUtil.closeAllResources(null, null, con);
		}
	}
}
