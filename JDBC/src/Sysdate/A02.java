/**
 * 
 */
package Sysdate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import class3.util;

/**
 * @author Ashwin
 *
 */
public class A02
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
//			String sql="select to_char(joining_date , 'dd-MON-yyyy AD') joining_date from tab100";
			String sql="select to_char(joining_date , 'dd-mon-yyyy AD') joining_date from tab100";
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("joining_date"));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			util.closeAllResources(rs, stmt, con);
		}
	}
}
