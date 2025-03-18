public class G
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method ");
		test();
		System.out.println("Main Ends");
	}
		public static void test() 
	{
		System.out.println("Test Method ");
		test1();
		System.out.println("Test Ends");
	}
	public static void test1() 
	{
		System.out.println("Test1 Method ");
		test2();
		System.out.println("Test1 Ends");
	}
		public static void test2() 
	{
		System.out.println("Test2 Method ");
		int i = 10;
		System.out.println(i);
		System.out.println("Test2 Ends");
	}
}
