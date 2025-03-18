package class1;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * 
 */

/**
 * @author Ashwin
 *           we are working on bulk by using file....
 */
public class A04
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws Exception
	{
		Properties pr=new Properties();
		pr.load(new FileReader("sql.properties"));
		Set keys=pr.keySet();
		Iterator it=keys.iterator();
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
		Statement stmt=con.createStatement();
		String key,sql;
		while(it.hasNext())
		{
			key=(String)it.next();
			sql=(String)pr.getProperty(key);
			stmt.executeUpdate(sql);
		}
		System.out.println("Done");
	}
}
