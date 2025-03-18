abstract class A
{
	abstract void test2();
}

class AB //extends A
{
	void test()
	{
		System.out.println("ABC");
	}
	void test1()
	{
		System.out.println("XYZ");
	}
	void test2()
	{
		System.out.println("ABS-XYZ");
	}
	public static void main(String[] args)
	{
		class ABC extends AB
		{
			A a1=new A()
				{
					void test2()
					{
						System.out.println("TEst2-main");
					}
				
				};
				
				a1.test2();
	//		a1.test();
	//		a1.test1();
			
		}
	}
}