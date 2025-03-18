/**
 * 
 */
package Simple;

import java.io.File;
import java.io.IOException;

/**
 * @author Ashwin
 *   we are creating a file and check the status or by exists method file is there or not.............
 */
public class A01
{
	public static void main(String[] args)
	{
		try
		{
		File f1=new File("abc.docx");
		System.out.println(f1.exists());
		boolean status=f1.createNewFile();
		System.out.println(status);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
}
