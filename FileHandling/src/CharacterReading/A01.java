/**
 * 
 */
package CharacterReading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ashwin
 *     reading data form existing file
 */
public class A01
{
	public static void main(String[] args)
	{
		File file=new File("hello.txt");
		FileReader in=null;
		try
		{
			in=new FileReader(file);
			char all[]=new char[(int)file.length()];
			in.read(all);
			String s1=new String(all);
			System.out.println(s1);
		}
		catch(IOException e)
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
			catch(IOException E)
			{
				E.printStackTrace();
			}
				// In Reading :- we cant use flush();
				//In Writting :- we can use flush();
			}
	}
}
