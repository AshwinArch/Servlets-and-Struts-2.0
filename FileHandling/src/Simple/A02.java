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
public class A02
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("E:/hello.txt");
		System.out.println(f.createNewFile());
	}
}
