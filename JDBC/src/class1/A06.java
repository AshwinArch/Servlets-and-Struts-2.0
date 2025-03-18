package class1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Ashwin
 *              delete row - wise data....
 */
public class A06
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
		Statement stmt=con.createStatement();
		stmt.execute("delete from tab10 where sno=10");
		System.out.println("Done");
	}
}
