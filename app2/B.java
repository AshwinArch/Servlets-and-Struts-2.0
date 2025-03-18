class A
{
int i;
}
class Manager
{
	static void test1()
	{
	A a1=new A();
	System.out.println(a1.i);
	}
	static void test2()
	{
	System.out.println(a1.i);
	a1.i=100;
	}
	static void test3()
	{
	System.out.println(i);
	i=200;
	}
	static void test4()
	{
		int i=10;
	return i;
	}
	static void test5()
	{
	A a1=new A();
	a1.i=1000;
	return a1;
	}
    static A test6()
	{return new A();
	}
	public static void main(String arg[])
	{
	test1();
	A a2=new A();
	test2(a2);
	System.out.println(a2.i);
	test3(a2.i);
	System.out.println(a2.i);
	System.out.println(test4());
	A a3=test5();
	System.out.println(a3.i);
	a3.i=2000;
		System.out.println(a3.i);
a3=test6();
	System.out.println(a3.i);
	}
}
