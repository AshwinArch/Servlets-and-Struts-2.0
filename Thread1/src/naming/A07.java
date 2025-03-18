package naming;

public class A07
{
	public static void main(String[] args)
	{
		I e1=new I("First");
		I e2=new I("Second");
		e1.start();
		e2.start();
		e1.run();
	}
}
class I extends Thread
{
	I(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getId()+" : "+i);
		}
	}
}
// its also one of the getting id convention....for threads........
