package doubt2;

public class AB
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		abstract class B
		{
			abstract void test();
			public void main(String[] array)
			{
				System.out.println(3);
			}
		}
		B b1 = new B()
		{
			void test()
			{
				System.out.println(2);
			}
		};
		b1.test();
		b1.main(args);

	}
}

