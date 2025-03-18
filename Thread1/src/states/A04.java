package states;
public class A04
{
	public static void main(String[] args)
	{
		P p1=new P();
		p1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(p1.getState());
	}
}
class P extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}