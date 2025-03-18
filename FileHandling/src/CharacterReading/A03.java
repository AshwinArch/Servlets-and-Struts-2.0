/**
 * 
 */
package CharacterReading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/**
 * @author Ashwin
 *     Buffered Writer 
 */
public class A03
{
	public static void main(String[] args)
	{
		File file=new File("test2.txt");
		FileWriter out=null;
		BufferedWriter bout=null;
		try
		{
			out=new FileWriter(file);
			bout=new BufferedWriter(out);
			bout.write("Hello To Everybody.");
			bout.newLine();
			bout.write("This is the Final.");
			bout.newLine();
			bout.write("End of the File.");
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
				if(bout!=null)
				{
					bout.flush();
					bout.close();
					bout=null;
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(out!=null)
				{
					out.close();
					out=null;
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
