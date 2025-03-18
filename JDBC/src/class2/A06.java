/**
 * 
 */
package class2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ashwin
 *
 */
public class A06
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=NewDbUtil.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from tab10");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colcount=rsmd.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=colcount; i++)
				{
					System.out.print(rs.getString(i)+",");
				}
			System.out.println();
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			NewDbUtil.closeAllResources(rs, stmt, con);
		}
	}
}
