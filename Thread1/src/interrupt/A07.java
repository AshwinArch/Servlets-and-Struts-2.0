package interrupt;

public class A07
{
	public static void main(String[] args)
	{
		H h1=new H();
		h1.start();
		System.out.println("Thread-Started");
		h1.stop();
		System.out.println("Thread-Stopped");
	}
}
class H extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}