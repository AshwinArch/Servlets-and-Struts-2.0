/**
 * 
 */
package Sysdate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;

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
		Statement stmt=null;
		try
		{
			con=util.getConnection();
			stmt=con.createStatement();
			Date d=new Date(0);
//			DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
//			DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
//			DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT);
//			DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
			DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
			String s1=df.format(d);
			System.out.println(s1);
	//		String s2="January 08 2011";
	//		String sql="insert into tab100 values(2, 'xyz', to_date(' "+s2+" ', 'month dd, yyyy'))";
	//		stmt.executeUpdate(sql);
	//		System.out.println("done");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			util.closeAllResources(null, stmt, con);
		}
	}
}
