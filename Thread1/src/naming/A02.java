package naming;
class D extends Thread
{
	public void run()
	{
		Thread t1=Thread.currentThread();
		for(int i=0;i<100;i++)
		{
			System.out.println(t1.getName()+" : "+i);
		}
	}
}
public class A02
{
	public static void main(String[] args)
	{
	D d1=new D();
	d1.start();
	d1.run();
	}
}
