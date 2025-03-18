package deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class H
{                                                                                                // Dead-lock condition......
	synchronized void test1(H e1)
	{
		System.out.println("Test1-Start");
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		e1.test2(this);
		System.out.println("Test1-End");
	}
	synchronized void test2(H e1)
	{
		System.out.println("Test2-Start");
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		e1.test1(this);
		System.out.println("Test2-End");
	}
}
class I extends Thread
{
	H e1,e2;
	I(H e1,H e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	public void  run()
	{
		e1.test1(e2);
	}
}
class J extends Thread
{
	H e1,e2;
	J(H e1,H e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	public void  run()
	{
		e2.test2(e1);
	}
}
public class A03
{
	public static void main(String[] args)
	{
		H e1=new H();
		H e2=new H();
		I f1=new I(e1,e2);
		J g1=new J(e1,e2);
		f1.start();
		g1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		ThreadMXBean bean=ManagementFactory.getThreadMXBean();
		long ids[]=bean.findMonitorDeadlockedThreads();
		ThreadInfo all[]=bean.getThreadInfo(ids);
		if (all!=null)
		{
			System.out.println("Threads which are under locked");
			for(int i=0;i<all.length;i++)
			{
//				ThreadInfo t1=all[i];
//				System.out.println(t1.getThreadName());
				System.out.println(all[i].getThreadName());
	//			System.out.println(all[i].getThreadState());
				
			}
		}
		else
		{
			System.out.println("no threads are under locked");
		}
	}
}
