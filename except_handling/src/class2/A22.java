package class2;

public class A22
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
		test1();
		}
		catch(ClassNotFoundException ex)
		{
		System.out.println(2);
		}
		System.out.println(3);
	}
	static void test1() throws ClassNotFoundException
	
	{
		System.out.println(4);
		test2();
		System.out.println(5);
	}
	static void test2() throws ClassNotFoundException
	{
		System.out.println(6);
		Class.forName("----");
		System.out.println(7);
	}
}
//throws will transfer control to calling statement