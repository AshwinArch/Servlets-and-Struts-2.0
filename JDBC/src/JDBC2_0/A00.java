/**
 * 
 */
package JDBC2_0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			con=util.getConnection();
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery("select * from test2");
			System.out.println("forward reading.");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			System.out.println("-----------------");
			System.out.println("backward direction.");
			while(rs.previous())
			{
			System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			rs.afterLast();
			System.out.println("-----------------");
			System.out.println("backward direction.");
			
			while(rs.previous())
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			System.out.println("-----------------");
			System.out.println("Reading from 4th row.");
		
			if(rs.absolute(4))
			{
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}
			System.out.println("-----------------");
			System.out.println("Reading from 6th Row..");
			
			if(rs.relative(2))
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			}
			rs.beforeFirst();
			System.out.println("-----------------");
			System.out.println("Reading from top-bottom...");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			}
			System.out.println("-----------------");
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
