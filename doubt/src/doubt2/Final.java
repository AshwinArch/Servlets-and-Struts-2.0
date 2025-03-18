/**
 * 
 */
package doubt2;

/**
 * @author Ashwin
 *
 */
public class Final 
{
public static void main(String[] args) 
{
		try
			{
				int i = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException e) 
			{
			}
			finally
			{
				return;
			}
			System.out.println("done");
}
}



