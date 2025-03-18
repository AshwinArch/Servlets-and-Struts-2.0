package class1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Ashwin
 *												insert bulk data Table TAB10
 */
public class A01
{
	public static void main(String[] args) throws Exception
	{
		//1. Registering a driver...
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		Connection con=null;
		Statement stmt=null;
		FileReader reader=new FileReader("sql.sql");
		BufferedReader breader=new BufferedReader(reader);
		String sql=breader.readLine();
		try
		{
			//2. Established Database Connection...
			con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
			
			//3. Create Statement to submit SQL Query....
			stmt=con.createStatement();
			
			//4. Compose Sql query..
//			String sql="CREATE TABLE TAB1(SNO INT, NAME VARCHAR(20))";
			
			//5.Send/Submit Sql query to the DB.
			while (sql!=null)
			{
				stmt.execute(sql);
				sql=breader.readLine();
			}
			System.out.println("Done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			//6. Close all DB Resources.
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
