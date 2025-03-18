package ash.com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @author Ashwin
 */
public class A01
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=Util.getConnection();
			pstmt=con.prepareStatement("update test1 set name = ? where sno= ? ");
			pstmt.setString(1, "abs");
			pstmt.setInt(2, 1000);
			pstmt.executeUpdate();

			pstmt.setString(3, "hello");
			pstmt.setInt(4, 1001);
			pstmt.executeUpdate();
			
			System.out.println("done");
		} 
		catch (SQLException e)
		{ 
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			Util.closedDbResources(null, pstmt, con);
		}
	}
}
