/**
 * 
 */
package class3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author Ashwin
 *
 */
public class A03
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try
		{
			con=util.getConnection();
			pstmt=con.prepareStatement("select * from test3 where sno= ?");
			pstmt.setInt(1, 1);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			System.out.println("--------------------");
			pstmt.setInt(1, 2);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			System.out.println("--------------------");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(rs, pstmt, con);
		}
	}
}
