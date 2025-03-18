package class2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Ashwin
 *
 */
public class A03
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=DBUtil.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from tab10");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			DBUtil.closeDbResources(rs, stmt, con);
		}
	}
}
