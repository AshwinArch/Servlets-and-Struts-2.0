package class3;

public class A03
{
	void method()throws ClassNotFoundException
	{
		Class.forName("-----");
	}
}
class C extends A03
{
	void method()   // throws ClassNotFoundException
	{
//		Class.forName("-----");
	}
}
class Prog3
{
	public static void main(String[] args)
	{
		C c1=new C();
		c1.method();
	}
}
//here we are performing overriding so compiler wont be go to class b1 void method()..