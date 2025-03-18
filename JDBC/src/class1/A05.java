package class1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Ashwin
 *									Update Existing Data....
 */
public class A05
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update tab10 set name='new name' where name ='abc1' ");
		System.out.println("done");
	}
}
