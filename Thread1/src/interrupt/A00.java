package interrupt;
public class A00
{
	public static void main(String[] args)
	{
		A5 a=new A5();
		a.start();
		a.interrupt();
		System.out.println("Main-End");
	}
}
class A5 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
		try
		{
			sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("End");
	}
}