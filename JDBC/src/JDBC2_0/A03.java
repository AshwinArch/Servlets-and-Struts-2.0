/**
 * 
 */
package JDBC2_0;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import class3.util;

import ash.com.Util;
/**
 * @author Ashwin
 *    Blob inserting.......
 */
public class A03
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try
		{
			con=Util.getConnection();
			pstmt=con.prepareStatement("insert into test1 values(? , ?, ?)");
			pstmt.setInt(1, 123);
			pstmt.setString(2," pramod");
			pstmt.setObject(3, getBytes());
			pstmt.executeUpdate();
			System.out.println("done");
		}
		catch (SQLException e)
		{
				e.printStackTrace();
				// TODO: handle exception
		}
		finally
		{
			util.closeAllResources(null, pstmt, con);
		}
	}
		private static byte[] getBytes() 
		{
			byte all[]=null;
			File file=new File("A.jpg");
			FileInputStream fin=null;
			BufferedInputStream bin=null;
			try
			{
				fin=new FileInputStream(file);
				bin=new BufferedInputStream(fin);
				all=new byte[(int)file.length()];
				bin.read(all);
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
					if(bin!=null)
					{
						bin.close();
						bin=null;
					}
				} 
				catch (IOException e)
				{
					e.printStackTrace();
					// TODO: handle exception
				}
				try
				{
					if(fin!=null)
					{
						fin.close();
						fin=null;
					}
				}
				catch (IOException e)
				{
					e.printStackTrace();
					// TODO: handle exception
				}
			}
			return all;
		}
	
}
