package sleep;

public class A02
{
	public static void main(String[] args)
	{
		A1 a1=new A1();
		a1.start();
	}
}

class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}