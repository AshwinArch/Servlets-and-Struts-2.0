package ash.com;

public class Manager7
{
	public static void main(String[] args)
	{
		Ac a1=new Ac(10)
					{
						void test1()
						{
							System.out.println("Changed");
						}
					};
		a1.test1();
	}
}
class Ac
{
	Ac(int i)
	{
		System.out.println("int ");
	}
	void test1()
	{
		System.out.println("test1");
	}
}