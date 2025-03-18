package class1;

public class A04
{
	public static void main(String[] args)
	{
		try
		{
			String s1=args[0];
			System.out.println(2);
		}
		catch(NumberFormatException ex1)
		{
			System.out.println(3);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(4);
		}
		finally
		{
			int i=Integer.parseInt("abc");
			System.out.println(5);
		}
			System.out.println(6);
	}
}
