package class2;

public class A02
{
	static int test(String s1)
	{
		try
		{
			return 100;
		}
		catch(ArithmeticException ex)
		{
			return 20;
		}
/*		catch(NumberFormatException ex1)
		{
			
		}
*/
	}
}
