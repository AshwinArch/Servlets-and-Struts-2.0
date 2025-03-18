package class1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashwin
 *
 */
public class A03
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String sql, sno, name, decider;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} 
		catch (ClassNotFoundException e)
		{
			// TODO: handle exception
		}
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=DriverManager.getConnection("jdbc:odbc:dsn", "system", "123");
			stmt=con.createStatement();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		do
		{
			System.out.println("Enter Sno.");
			sno=sc.next();
			System.out.println("Enter Name.");
			name=sc.next();
			sql="insert into tab10 values("+sno+",' "+name+" ')";
			try
			{
				stmt.executeUpdate(sql);
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("One more ?(Y/N)");
			decider=sc.next();
		} while ("Y".equals(decider));
	}
}
