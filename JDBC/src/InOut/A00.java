/**
 * 
 */
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
public class A00
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=util.getConnection();
			cstmt=con.prepareCall("{call p5(?, ?)}");
			cstmt.setInt(1, 4);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.execute();
			String name=cstmt.getString(2);
			System.out.println(name);
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
