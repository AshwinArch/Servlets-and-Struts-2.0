package class2;

public class A06
{
	public static void main(String[] args)
	{
		try
		{
			System.exit(0);
		}
		catch(ArithmeticException ex)
		{
			
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
class D
{
	public static void main(String[] args)
	{
		try
		{
			int i=Integer.parseInt("abc");
		}
		catch(NumberFormatException ex1)
		{
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
