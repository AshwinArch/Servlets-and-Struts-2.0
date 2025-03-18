package JDBC2_0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ash.com.Util;
import class3.util;
/**
 * @author Ashwin
 *		we are retrieving data from database which is in binary format(A.jpg) and
 * 	write in persisitent medium(B.jpg).
 * 	************************************Blob Reading****************************************
 */
public class A04
{
	public static void main(String[] args)
	{
		ResultSet rs=null;
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=Util.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select picture from test1 where sno=123");
			if(rs.next())
			{
				Blob blob=rs.getBlob("Picture");
				byte all[]=blob.getBytes(1, (int)blob.length());
				writeIntoFile(all);
			}
			System.out.println("done");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			util.closeAllResources(rs, stmt, con);
		}
	}
	private static void writeIntoFile(byte all[])
	{
		File file=new File("B.jpg");
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		try
		{
		fout=new FileOutputStream(file);
		bout=new BufferedOutputStream(fout);
		bout.write(all);
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
				if(bout!=null)
				{
					bout.flush();
					bout.close();
					bout=null;
				}
			} 
			catch (IOException e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
			try
			{
				if(fout!=null)
				{
					fout.close();
					fout=null;
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
		