package naming;

public class A05
{
	public static void main(String[] args)
	{
		G e1=new G();
		G e2=new G();
		e1.start();
		e2.start();
		e1.run();
	}
}
class G extends Thread
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
// 2 child thread will be created and we will be getting 2 child thread name as thread-0 :,thread-1 :.
// & one main thread name as main :.