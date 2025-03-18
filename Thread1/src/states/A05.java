package states;
public class A05
{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		Q q1=new Q(t);
		q1.start();
		try
		{
			q1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class Q extends Thread
{
	Thread t=null;
	Q(Thread t)
	{
		this.t=t;
	}
	public void run()
	{
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(t.getState());
	}
}