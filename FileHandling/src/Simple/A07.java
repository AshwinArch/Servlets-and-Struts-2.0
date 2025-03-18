/**
 * 
 */
package Simple;

import java.io.File;
import java.io.IOException;

/**
 * @author Ashwin
 *		here we are creating one directory "E:/A/B/C/D/E/F" and one file "test.txt" 
 *it will craete all folder of directory.......
 */
public class A07
{
	public static void main(String[] args)
	{
		File f=new File("E:/A/B/C/D/E/F");
		File f1=new File(f, "test.txt");
		System.out.println(f.mkdirs());
		try
		{
		System.out.println(f1.createNewFile());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
