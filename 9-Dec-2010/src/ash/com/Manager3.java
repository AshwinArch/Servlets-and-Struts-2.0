package ash.com;
interface C
{
	void test1();
}
public class Manager3
{
	static C gets()
	{
		C c1=new C()
				{
					public void test1()
					{
						System.out.println("Done");
					}
				};
				return c1;
	}
	public static void main(String[] args)
	{
			C b=gets();
			b.test1();
	}
}
