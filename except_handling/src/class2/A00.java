package class2;

public class A00
{
	static int test(String st)
	{
		int i=0;
		try
		{
			i=Integer.parseInt(st);
			return i;
		}
		catch(NumberFormatException ex)
		{
			return i;
		}
		finally
		{
			return 100;
		}
	}
	public static void main(String[] args)
	{
		int i=test(args[0]);
		System.out.println(i);
	}
}
