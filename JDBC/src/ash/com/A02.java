/**
 * 
 */
package ash.com;
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
			con=Util.getConnection();
			pstmt=con.prepareStatement("insert into test2 values(?, ?, ?, ?)");
			pstmt.setInt(1, 1100);
			pstmt.setString(2, "hello");
			pstmt.setInt(4, 30);
			pstmt.setInt(3, 3090);
			pstmt.executeUpdate();
		
			pstmt.setInt(1, 1101);
			pstmt.setString(2, "hello-abc");
			pstmt.setInt(4, 31);
			pstmt.setInt(3, 3095);
			pstmt.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			Util.closedDbResources(null, pstmt, con);
			System.out.println("done");
		}
	}
}