package class3;

public class A04
{
	public static void main(String[] args)
	{
		B2 b1=new B2();
		b1.method();
	}
}
class A1
{
	void method()throws Exception
	{}
}
class B2 extends A1
{
	void method()throws NullPointerException,ArithmeticException
	{}
}
/*
 *Here we are passing super class exception in class A1.
 *and then we are passing unchecked exception in sub class which is absolutely possible.    */