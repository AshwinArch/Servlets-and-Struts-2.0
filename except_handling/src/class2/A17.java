package class2;

public class A17
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
		test1();
		}
		catch(ArithmeticException ex)
		{
		System.out.println(2);
		}
		System.out.println(3);
	}
	static void test1()
	{
		System.out.println(4);
		test2();
		System.out.println(5);
	}
	static void test2()
	{
		System.out.println(6);
		int i=10/0;
		System.out.println(7);
	}
}
