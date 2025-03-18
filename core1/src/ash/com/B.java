package ash.com;

class AB
{
	void test()
	{
		System.out.println("A");
	}
}
public class B
{
	public static void main(String[] args)
	{
		AB b1=new AB();
		b1.test();
		AB b2=new AB();
		b2.test();
		AB b3=new AB()
		{
				void test()
				{
					System.out.println("AIC");
				}
		};
		b3.test();
	}
}
