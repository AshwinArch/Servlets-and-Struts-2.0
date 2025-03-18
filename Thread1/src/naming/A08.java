package naming;

public class A08
{
	public static void main(String[] args)
	{
		j e1=new j();
		j e2=new j();
		e1.setName("Child-1");
		e2.setName("Child-2");
		e1.start();
		e2.start();
		e1.run();
	}
}
class j extends Thread
{
	public void run()
	{
		Thread r1=Thread.currentThread();
		for(int i=0;i<100;i++)
		{
			System.out.println(r1.getName()+" : "+i);
		}
	}
}
// its also one of the getting id convention....for threads........