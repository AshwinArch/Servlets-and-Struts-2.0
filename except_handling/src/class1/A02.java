package class1;

public class A02
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(1);
			String s1=args[0];
			System.out.println(2);
			int i=Integer.parseInt(s1);
			System.out.println(3);
			int k=i/(i-9);
			System.out.println(4);
		}
		catch(ArithmeticException ex)
		{ 
			int m=Integer.parseInt("abc");
			System.out.println(5);
		}
		catch(NumberFormatException ex1)
		{
			System.out.println(6);
		}
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
	}
}
