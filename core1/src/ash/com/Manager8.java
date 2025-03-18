package ash.com;

public class Manager8
{
	public static void main(String[] args)
	{
		Ac1 a1=new Ac1(10)
					{
						void test1()
						{
							System.out.println("Changed");
						}
						{System.out.println("IIB");}
					};
		a1.test1();
	}
}
class Ac1
{
	Ac1(int i)
	{
		System.out.println("int ");
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB-1");
	}
	void test1()
	{
		System.out.println("test1");
	}
}