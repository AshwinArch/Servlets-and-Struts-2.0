/**
 * 
 */
package Serialization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @author Ashwin
 *
 */
public class Manager2
{
	public static void main(String[] args)
	{
		Person p1=new Person("abc", 22, 55.90);
		File file=new File("p1.txt");
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream(file);
			out=new ObjectOutputStream(fout);
			out.writeObject(p1);
			System.out.println("done");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			try
			{
				if(out!=null)
				{
					out.flush();
					out.close();
				}
			}
			catch (Exception e2)
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
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
