package class1;

public class A01
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
		System.out.println("End");
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(NumberFormatException ex1)
		{
			System.out.println(ex1);
		}
	}
}
