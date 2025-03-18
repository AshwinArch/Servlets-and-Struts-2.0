package interrupt;
public class A05
{
	public static void main(String[] args)
	{
		E e1=new E();
		e1.start();
		try
		{
			e1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Main-Thread");
	}
}
class D extends Thread
{
	public void run()
	{
		System.out.println("D - Thread");
	}
}
class E extends Thread
{
	public void run()
	{
		D d1=new D();
		d1.start();
		try
		{
			d1.join();
//			d1.interrupt();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("E-Thread");
	}
}