/**
 * 
 */
package BinaryInteraction;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ashwin
 *			binary data reading and writting...
 */
public class A00
{
	public static void main(String[] args)
	{
		File file1=new File("E:/A.jpg");
		File file2=new File("New.jpg");
		
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		try
		{
			fin = new FileInputStream(file1);
			bin=  new BufferedInputStream(fin);
			fout=new FileOutputStream(file2);
			bout= new BufferedOutputStream(fout);
			byte all[]=new byte[(int)file1.length()];
			bout.write(all);
			bin.read(all);
			System.out.println("done");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(bout!=null)
				{
					bout.flush();
					bout.close();
				}
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
			try
			{
				if(fout!=null)
				{
					fout.close();
				}
			} 
			catch (Exception e2)
			{
				System.out.println(e2);
				// TODO: handle exception
			}
			try
			{
				bin.close();
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
			try
			{
				if(fin!=null)
				{
					fin.close();
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		System.out.println("done");
	}
}
