/**
 * 
 */
package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ashwin
 *
 */
public class Manager3
{
	public static void main(String[] args)
	{
		File file=new File("p1.txt");
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream(file);
			in=new ObjectInputStream(fin);
			Person p=(Person)in.readObject();
			System.out.println(p);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(in!=null)
				{
					in.close();
					in=null;
				}
			} 
			catch (Exception e2)
			{
				e2.printStackTrace();
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
			catch (Exception e2)
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
