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
public class A03
{
	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement cstmt=null;
		try
		{
			con=util.getConnection();
			cstmt=con.prepareCall("{call p4(?, ?)}");
			
			cstmt.setInt(1, 5000);
			cstmt.setString(2, "new");
			cstmt.execute();
			
			cstmt.setInt(1, 6000);
			cstmt.setString(2, "Ashwin");
			cstmt.execute();
			
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
