package class3;

public class A13
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);
		if (age<=0)
		{
			throw new ArithmeticException("Age should not be less then 0...");
		}
		
	}
}
