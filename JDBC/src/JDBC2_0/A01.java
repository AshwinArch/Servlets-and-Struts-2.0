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
public class A01
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
			rs=stmt.executeQuery("select sno,name from test1");
			///update row...
			if(rs.absolute(2))
			{
				rs.updateString(2, "ramu");
				rs.updateRow();
			}
			///delete row....
			if(rs.absolute(4))
			{
				rs.deleteRow();
			}
			///insert new row....
			rs.moveToInsertRow();
			rs.updateInt(1, 200);
			rs.updateString(2, "Kiran");
			rs.insertRow();
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			}
		} 
		catch (SQLException  e)
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
