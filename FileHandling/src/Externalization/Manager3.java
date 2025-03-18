package Externalization;
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
		Person p2=new Person();
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("p2.txt");
			in=new ObjectInputStream(fin);
			p2.readExternal(in);
			System.out.println(p2);
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

