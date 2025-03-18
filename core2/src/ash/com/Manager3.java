package ash.com;

public class Manager3
{
/*	static void test(byte b)
	{
		System.out.println("byte");
	}

	static void test(short s)
	{
		System.out.println("short");
	}

	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(long l)
	{
		System.out.println("long");
	}
	static void test(float f)
	{
		System.out.println("float");
	}

	static void test(double d)
	{
		System.out.println("double");
	}

	static void test(Byte b)
	{
		System.out.println("Byte");
	}
*/
	static void test(Double d)
	{
		System.out.println("Double");
	}
/*	static void test(Number n)
	{
		System.out.println("Number");
	}
*/
/*	static void test(Object obj)
	{
		System.out.println("Object");
	}
*/
	static void test(byte ... b)
	{
		System.out.println("Var Args");
	}

	public static void main(String[] args)
	{
		byte b=100;
		test(b);
	}
}
