/**
 * 
 */
package doubt2;

/**
 * @author Ashwin
 *
 */
import java.io.IOException;
class TestException extends Exception
{	
}
class U
{
	public String sayHello(String name)throws TestException
	{
			if(name == null)
			{
				throw new TestException();
			}
			return "Hello"+name;
		}
}
public class Example 
{
public static void main(String[] args)
{
U u1 = new U();
System.out.println(u1.sayHello("john"));
}
}
