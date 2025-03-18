package ash.com;

class A12
{
	void test1()
	{
		System.out.println(1);
	}
}
class manager6
{
	public static void main(String[] args)
	{
		A12 a2=new A12();
		A12 a1=new A12()
				{
				void test1()
				{
					System.out.println(2);
				}
			};
		a1.test1();
		a2.test1();
	}
}
