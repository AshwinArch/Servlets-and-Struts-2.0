package ash.com;

class X
{
	void test1()
	{
		System.out.println("1");
	}
	void test2()
	{
		System.out.println("2");
	}
}
class Y
{
	public static void main(String[] args)
	{
		X x1=new X();
		X x2=new X()
				{
					void test1()
					{
						System.out.println("3");
					}
				};
		X x3=new X()
				{
					void test2()
					{
						System.out.println("4");
					}
				};
		X x4=new X()
				{
					void test1()
					{
						System.out.println("5");
					}
					void test2()
					{
						System.out.println("6");
					}
				};
		x1.test1();
		x1.test2();
		x2.test1();
		x2.test2();
		x3.test1();
		x3.test2();
		x4.test1();
		x4.test2();
	}
}
