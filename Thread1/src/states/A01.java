package states;
public class A01
{
	public static void main(String[] args)
	{
		L l=new L();
		System.out.println(l.getState());
		l.start();
		System.out.println(l.getState());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(l.getState());
	}
}
class L extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
