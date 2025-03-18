package sleep;
class util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class A2 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			util.sleep(1000);
		}
	}
}
class B2 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			util.sleep(1000);
		}
	}
}
public class A03
{
	public static void main(String[] args)
	{
		A2 a=new A2();
		B2 b=new B2();
		a.start();
		b.start();
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			util.sleep(1000);
		}
	}
}
