/**
 * 
 */
package com.ash.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ashwin
 *
 */
public class DBUtil
{
	public static void closeDBResources(ResultSet rs, Statement stmt)
	{
		try
		{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(stmt!=null)
			{
				stmt.close();
				stmt=null;
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
