package interrupt;

public class A04 extends Thread
{
	static int i;
	public void run()
	{
		i=200;
	}
	public static void main(String[] args)
	{
		i=20;
		A04 a=new A04();
		a.start();
		System.out.println(i);
		try
		{
			a.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(i);
		
	}
}
