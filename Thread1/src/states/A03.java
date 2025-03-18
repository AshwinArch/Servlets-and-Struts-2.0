package states;

public class A03
{
	public static void main(String[] args)
	{
		N n1=new N();
		n1.start();
		n1.stop();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex){}
		System.out.println(n1.getState());
	}
}
class N extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}