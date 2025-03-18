package interrupt;

public class A03
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.start();
		try
		{
			a1.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Main-End");
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}