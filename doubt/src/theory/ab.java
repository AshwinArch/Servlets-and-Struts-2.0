/**
 * 
 */
package theory;

import java.util.Scanner;

/**
 * @author Ashwin
 *
 */
public class ab
{
	public static void main(String[] args)
	{
		/*System.out.printf("%f-%b", Math.PI, Math.E);*/
		
		Scanner scanner=new Scanner("sd,dsf,fsf,sdf,324,24,23,423");
		scanner.useDelimiter(",");
		while(scanner.hasNextBoolean())
		{
			System.out.println(scanner.nextBoolean());
		}
	}
}
