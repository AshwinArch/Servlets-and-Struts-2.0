/**
 * 
 */
package Simple;

import java.io.File;
import java.io.IOException;

/**
 * @author Ashwin
 *
 */
public class A08
{
	public static void main(String[] args)throws IOException
	{
		File file=new File("abc.txt");
		System.out.println(file.length());
		System.out.println(file.createNewFile());
		System.out.println(file.length());
	}
}
