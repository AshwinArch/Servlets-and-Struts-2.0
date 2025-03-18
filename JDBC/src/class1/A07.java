package class1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * @author Ashwin
 */
public class A07
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from tab10");
		int sno;
		String name;
		while (rs.next())
		{
			sno=rs.getInt(1);
			name=rs.getString(2);
			System.out.println(sno+" , "+name);
			System.out.println("------------------");
		}
	}
}