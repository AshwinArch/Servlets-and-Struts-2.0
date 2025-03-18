package ash.com;

public class Manager2
{
	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(Integer i)
	{
		System.out.println("integer");
	}
	public static void main(String[] args)
	{
		test(10);
		Integer i1=new Integer(1);
		test(i1);
		test(new Integer(10));
	}
}
