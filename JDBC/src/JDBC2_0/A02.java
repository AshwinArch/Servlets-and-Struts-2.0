/**
 * 
 */
package JDBC2_0;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import class3.util;

/**
 * @author Ashwin
 *
 */
public class A02
 {
		public static void main(String[] args)
		{
			Connection con=null;
			Statement stmt=null;
			try
			{
				con=util.getConnection();
				stmt=con.createStatement();
				stmt.addBatch("insert into test1 values(900, 'pawan')");
				///only dml will be allowed here....
				stmt.addBatch("update test1 set name ='latest' where sno=100");
				stmt.addBatch("delete from test2 where sno=1");
				int results[]=stmt.executeBatch();
				System.out.println(Arrays.toString(results));
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				util.closeAllResources(null, stmt, con);
			}
		}
 }