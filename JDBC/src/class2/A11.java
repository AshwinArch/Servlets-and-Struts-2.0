/**
 * 
 */
package class2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import ash.com.Util;

/**
 * @author Ashwin
 *
 */
public class A11
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=Util.getConnection();
			pstmt=con.prepareStatement("insert into test2 values(?, ?, ?, ?)");
			int records=saveIntoDb(pstmt);
			System.out.println(records+"records inserted.");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			Util.closedDbResources(null, pstmt, con);
		}
	}
	private static int saveIntoDb(PreparedStatement pstmt) throws SQLException
	{
		File file=new File("emp1.txt");
		FileReader reader=null;
		BufferedReader bReader= null;
		String s1, name, age, salary;
		int sno=0,records=0;
		try
		{
			reader=new FileReader(file);
			bReader=new BufferedReader(reader);
			s1=bReader.readLine();
			while (s1!=null)
			{
				name=s1.substring(0, s1.indexOf(':'));
				age=s1.substring(s1.indexOf(':')+1, s1.lastIndexOf(':'));
				salary=s1.substring(s1.lastIndexOf(':')+1);
				pstmt.setInt(1, ++sno);
				pstmt.setString(2, name);
				pstmt.setInt(3, Integer.parseInt(age));
				pstmt.setInt(4, Integer.parseInt(salary));
				records +=pstmt.executeUpdate();
				s1=bReader.readLine();
			}
		}
		catch (IOException e)
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
			catch(IOException e)
			{
				e.printStackTrace();
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
		return records;
	}
}
		