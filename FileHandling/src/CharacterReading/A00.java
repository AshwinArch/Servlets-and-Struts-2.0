/**
 * 
 */
package CharacterReading;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args)
	{
		File file=new File("hello.txt");
		FileWriter out=null;
		try
		{
			out=new FileWriter(file);
			out.write("Hello To All\n");
			out.write("Hello To All\n");
			out.write("Hello To All\n");
			System.out.println("done");
		}
		catch(IOException e)
		{
			e.printStackTrace();
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
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
