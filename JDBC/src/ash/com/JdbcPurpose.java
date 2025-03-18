/**
 * 
 */
package ash.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Ashwin
 *
 */
public class JdbcPurpose
{
	public static void  userName()throws Exception
	{
		ResultSet rs=null;
		Connection con=null;
		Statement stmt=null;
		String sql="select user_name from nur_user";
		
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList user=new ArrayList();
		if(rs.next())
		{
			user.add(rs.getObject(1));
		}
		user.contains(o)
		
	}

}
