/**
 * 
 */
package class3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Ashwin
 *
 */
public class A02
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=util.getConnection();
			pstmt=con.prepareStatement("insert into test3 values(1, 'abc')");
			pstmt.execute();
			System.out.println("done");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(null, pstmt, con);
		}
	}
}
