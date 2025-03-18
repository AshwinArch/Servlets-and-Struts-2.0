package intercomm;
class A
{
	/**
	 * Inter-Thread communication.......
	 */
}
class B extends Thread
{
	A a1=null;
	B(A a1)
	{
		this.a1=a1;
	}
	public void run()
	{
		synchronized (a1)
		{
			try
			{
				a1.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("End");
	}
}
public class Manager
{
	public static void main(String[] args)
	{
		A a1=new A();
		B b1=new B(a1);
		b1.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Notifying");
		synchronized (a1)
		{
			a1.notify();
		}
	}
}
