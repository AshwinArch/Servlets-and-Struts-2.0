package class1;

public class A05
{
	public static void main(String[] args)
	{	try
		{
		System.out.println(1);
			try
			{
				String s1=args[0];
				System.out.println(2);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(3);
			}
			int i=10/0;
			System.out.println(4);
			}
			catch(ArithmeticException ex1)
			{
				try
				{
					int i=Integer.parseInt("abc");
				}
				catch(NumberFormatException ex2)
				{
					System.out.println(5);
				}
				System.out.println(6);
			}
			finally
			{
				try
				{
					int i=10/0;
				}
				catch(ArithmeticException ex12)
				{
					System.out.println(7);
				}
				System.out.println(8);
			}
			System.out.println(9);
		}
}
