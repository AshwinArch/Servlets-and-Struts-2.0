/**
 * 
 */
package Simple;

import java.io.File;

/**
 * @author Ashwin
 *			this cmd will give true only when all folders are already exists is location & we are creating only C folder...
 */
public class A05
{
	public static void main(String[] args)
	{
		File f=new File("F:/A/B/C");
		System.out.println(f.mkdir());
	}
}
