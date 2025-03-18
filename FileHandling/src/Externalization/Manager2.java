package Externalization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * @author Ashwin
 *
 */
public class Manager2
{
	public static void main(String[] args)
	{
		Person p2=new Person("abc", 22, 55.90);
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream("p2.txt");
			out=new ObjectOutputStream(fout);
			p2.writeExternal(out);
			System.out.println("done");
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
				if(out!=null)
				{
					out.flush();
					out.close();
					out=null;
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
					fout=null;
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
