package ash.com;
class A11
{
	void test1()
	{
		System.out.println(1);
	}
}
class B11
{
	static void method1(A11 a)
	{
		a.test1();
	}
}
class Manager4
{
	public static void main(String[] args)
	{
			B11.method1(new A11());
			A11 a=new A11();
			B11.method1(a);
			B11.method1(new A11()
						{
							void test1()
							{
								System.out.println(2);
							}});
}
}
