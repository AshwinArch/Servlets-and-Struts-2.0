/**
 * 
 */
package Callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

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
			cstmt=con.prepareCall("{call p3}");
			cstmt.execute();
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
