package ash.com;

public class A
{
	public static void main(String[] args)
	{
		int i=10;
		final int j=20;
		class AB
		{
			void test()
			{
		//		System.out.println(i);
				System.out.println(j);
			}
		}
		AB a1=new AB();
		a1.test();
		i=100;
		a1.test();
	}
}
