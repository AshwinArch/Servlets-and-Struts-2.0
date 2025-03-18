package JDBC3_0;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import class3.util;
/**
 * @author Ashwin
 *   we are reading auto generated keys from
 */
public class A00
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=util.getConnection();
			stmt=con.createStatement();
			String sql="insert into test3 values(1, 'pqr')";
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs=stmt.getGeneratedKeys();
			ResultSetMetaData rsmd=rs.getMetaData();
			int colCount=rsmd.getColumnCount();
			while(rs.next())
			{
				for (int i = 1; i<=colCount;i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
				}
				System.out.println("----------------");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(rs, stmt, con);
		}
	}
}
