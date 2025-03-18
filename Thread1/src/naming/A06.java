package naming;

public class A06
{
	public static void main(String[] args)
	{
		H e1=new H("First");
		H e2=new H("Second");
		e1.start();
		e2.start();
		e1.run();
	}
}
class H extends Thread
{
	H(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
// its also one of the naming convention....for threads........
