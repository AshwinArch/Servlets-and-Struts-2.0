package class2;

public class A20
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
		test2();
		System.out.println(4);
	}
	static void test2()
	{
		System.out.println(5);
		try
		{
			Class.forName("----");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(6);
		}
		System.out.println(7);
	}
}
