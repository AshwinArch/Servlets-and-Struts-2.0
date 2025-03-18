package naming;

public class A09
{
	public static void main(String[] args)
	{
		B b1 =new B();
		b1.start();
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		A a1=new A();
		a1.start();
	}
}