package class2;
public class A25
{
	A25()throws ClassNotFoundException
	{
		Class.forName("-----");// TODO Auto-generated constructor stub
	}
}
class D1 extends A25
{
	D1()throws ClassNotFoundException
	{
		super();
	}
	void test()
	{
		System.out.println("Done");
	}
}
class Manager34
{
	public static void main(String[] args)throws ClassNotFoundException
	{
		D1 d1=new D1();
		d1.test();
	}
}
//throws will transfer control to calling statement