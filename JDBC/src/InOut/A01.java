package InOut;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import class3.util;
/**
 * @author Ashwin
 *
 */
public class A01
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=util.getConnection();
			cstmt=con.prepareCall("{call p6(?, ?)}");
			cstmt.setInt(1, 1500);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setInt(2, 2);
			cstmt.execute();
//			int finalsalary=Integer.parseInt(cstmt.getString(1));
			int finalsalary=cstmt.getInt(1);
			System.out.println(finalsalary);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(null, cstmt, con);
		}
	}
}
