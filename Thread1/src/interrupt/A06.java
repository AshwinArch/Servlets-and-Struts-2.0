package interrupt;
public class A06
{
	public static void main(String[] args)
	{
		G g1=new G();
		g1.start();
		g1.suspend();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Resuming");
		g1.resume();
	}
}
class G extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}