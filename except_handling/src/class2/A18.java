package class2;

public class A18
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	static void test1()
	{
		System.out.println(3);
		try
		{
			test2();
		}
		catch(ArithmeticException ex)
		{
			System.out.println(4);
		}
//		finally
	//	{
		System.out.println(5);
//		}
		}
	static void test2()
	{
		System.out.println(6);
		int i=10/0;
		System.out.println(7);
	}
}
