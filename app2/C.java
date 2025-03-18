class A
{
	A()
	{
	B b1=new B();
	b1.method();
	}
}
class B
{
	void method()
	{
	int i=10;
	System.out.println(i);
	}
}

class Manager
{
	public static void main(String args[])
	{
	A a1=new A();
	}
}
