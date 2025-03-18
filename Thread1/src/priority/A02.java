package priority;

public class A02
{
	public static void main(String[] args)
	{
		J j1=new J();
		j1.start();
		Thread t1=Thread.currentThread();
		t1.setPriority(Thread.MAX_PRIORITY); /// priority is always depend on main thread...
		
		K k1=new K();
		k1.start();
	}
}
class J extends Thread 
{
	public void run()
	{
		System.out.println("J: "+getPriority());
	}
}
class K extends Thread
{
	public void run()
	{
		System.out.println("k: "+getPriority());
	}
}