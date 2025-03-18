/**
 * 
 */
package class2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ashwin
 *
 */
public class A07
{
	public static void main(String[] args)throws IOException
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=NewDbUtil.getConnection();
			stmt=con.createStatement();
			populateDataIntoDb(stmt);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			NewDbUtil.closeAllResources(null, stmt, con);
		}
	}
	private static void populateDataIntoDb(Statement stmt)throws IOException
	{
		File file=new File("data.txt");
		FileReader reader=null;
		BufferedReader bReader=null;
		String s1, sno, name, sql;
		try
		{
			reader=new FileReader(file);
			bReader = new BufferedReader(reader);
			s1=bReader.readLine();
			while (s1!=null)
			{
				sno=s1.substring(0, s1.indexOf(','));
				name=s1.substring(s1.indexOf(',')+1);
				sql="insert into tab10 values ("+sno+",' "+name+" ' )";
				stmt.executeUpdate(sql);
				s1=bReader.readLine();
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			try
			{
				if(bReader!=null)
				{
					bReader.close();
					bReader=null;
				}
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
			try
			{
				if(reader!=null)
				{
					reader.close();
					reader=null;
				}
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
