package class2;

public class A01
{
	static int test(String str)
	{
		int i=0;
		try
		{
			i=Integer.parseInt(str);
			return i;
		}
		catch(NumberFormatException ex)
		{
			return i;			
		}
		finally
		{
			System.out.println("I am in the finally");
		}
	}
	public static void main(String[] args)
	{
		int i=test(args[0]);
		System.out.println(i);
	}
}
