package naming;
public class A04
{
	public static void main(String[] args)
	{
		f e1=new f();
		f e2=new f();
		e1.start();
		e2.start();
		e1.run();
	}
}
class f extends Thread
{
	public void run()
	{
		Thread t1=Thread.currentThread();
		for(int i=0;i<100;i++)
		{
			System.out.println(t1.getId()+" : "+i);
		}
	}
}
//2 child thread will be created and we will be getting 2 child thread id as 8 :,9 :.
//& one main thread id as 1 :.