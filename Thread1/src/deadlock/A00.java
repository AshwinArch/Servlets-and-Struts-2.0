package deadlock;

public class A00
{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		A1 a1=new A1(t);
		a1.start();
		try
		{
			a1.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Interrupted");
		}		
	}
}
class A1 extends Thread
{
	Thread t=null;
	A1(Thread t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("Interrupted");
	}
}
