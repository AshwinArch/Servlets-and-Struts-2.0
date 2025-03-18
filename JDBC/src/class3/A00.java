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
public class A00
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=util.getConnection();
			pstmt=con.prepareStatement("create table test3(sno int, name varchar(90))");
			pstmt.execute();
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
		System.out.println("done");
	}
}
