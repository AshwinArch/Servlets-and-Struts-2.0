package ash.com;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import class2.NewDbUtil;
/**
 * @author Ashwin
 *
 */
public class Util
{
	public static final String className;
	public static final String url;
	public static final String user;
	public static final String password;
	static
	{
		Properties pr=null;
		try
		{
			pr=new Properties();
			pr.load(new FileReader("db-constant.properties"));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		className=pr.getProperty("className");
		url=pr.getProperty("url");
		user=pr.getProperty("user");
		password=pr.getProperty("password");
	}
	static
	{
		try
		{
			Class.forName(className);
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
		public static Connection getConnection() throws SQLException
		{
			return DriverManager.getConnection(url, user, password);
		}
		public static void closedDbResources(ResultSet rs, Statement stmt, Connection con)
		{
			NewDbUtil.closeAllResources(rs, stmt, con);
		}
}