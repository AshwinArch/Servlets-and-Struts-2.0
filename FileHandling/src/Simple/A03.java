/**
 * 
 */
package Simple;

import java.io.File;
import java.io.IOException;

/**
 * @author Ashwin
 *   file creating in any of the location...........
 */
public class A03
{
	public static void main(String[] args)
	{
		try
		{
		File file=new File("E:/folder","test.txt");
		System.out.println(file.createNewFile());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
