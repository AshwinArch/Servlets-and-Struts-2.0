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
public class A01
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=util.getConnection();
			pstmt=con.prepareStatement("insert into tab3 values(1, ?)");
			pstmt.setString(1, "Ashwin");
			pstmt.executeUpdate();
		} 
		catch (SQLException e)
		{
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(null, pstmt, con);
		}
	}
}
