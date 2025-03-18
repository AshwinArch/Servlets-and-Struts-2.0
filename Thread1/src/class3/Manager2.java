
package class3;

/**
 * @author instead of using one global test object...
 * we are using thread locale by which we are doing changes only locally. 
 *
 */
class util1
{
	static void sleep(long m)
	{
		try
		{
			Thread.sleep(m);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class threadA extends Thread
{
	ThreadLocal t;
	threadA(ThreadLocal t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println(t.get());
		t.set(10);
		util1.sleep(10);
		System.out.println(t.get());
		t.set(20);
		util1.sleep(60);
		System.out.println(t.get());
		t.set(30);
	}
}
class threadB extends Thread
{
	ThreadLocal t;
	threadB(ThreadLocal t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println(t.get());
		t.set(40);
		util1.sleep(10);
		System.out.println(t.get());
		t.set(50);
		util1.sleep(100);
		System.out.println(t.get());
		t.set(60);
	}
}
public class Manager2
{
	public static void main(String[] args)
	{
		ThreadLocal t3=new ThreadLocal();
		t3.set(70);
		threadA t1=new threadA(t3);
		threadB t2=new threadB(t3);
		t1.start();
		util.sleep(5);
		t2.start();
		util1.sleep(500);
		System.out.println(t3.get());
	}	
}
