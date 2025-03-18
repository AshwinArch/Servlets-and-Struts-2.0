import java.io.Console;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args) throws IOException
	{
		Console c1=System.console();
		System.out.println("Enter pw:");
		char all[]=c1.readPassword();
		String s1=new String(all);
		System.out.println("you entered :"+s1);
	}
}
