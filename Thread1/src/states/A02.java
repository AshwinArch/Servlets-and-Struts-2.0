package states;

public class A02
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		M m1=new M();
		m1.start();
		m1.suspend();
		System.out.println(m1.getState());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(m1.getState());
		m1.resume();
		System.out.println(m1.getState());
	}
}
class M extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
