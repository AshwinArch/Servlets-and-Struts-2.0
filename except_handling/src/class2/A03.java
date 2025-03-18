package class2;

public class A03
{

	static int test(String s1)
	{
		try
		{
//			return 100;
		}   
		catch(ArithmeticException ex)
		{
			return 20;
		}
		catch(NumberFormatException ex1)
		{
			return 0;
		}
		return 299;
	}
}
//if any of the three blocks do not have return statement then we can use external return.