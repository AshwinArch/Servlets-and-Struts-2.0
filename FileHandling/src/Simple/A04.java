/**
 * 
 */
package Simple;

import java.io.File;

/**
 * @author Ashwin
 *     creating one folder, (name: abc) in our project...
 */
public class A04
{
	public static void main(String[] args)
	{
		File f=new File("abc");
		f.mkdir();
	}
}
