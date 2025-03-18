package class3;

class test
{
	int i;
}                               //////here we are using one global test object.it will reflect changes from 
													//anywhere to any threads......
class util
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
class thread1 extends Thread
{
	test t;
	thread1(test t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println(t.i);
		t.i=10;
		util.sleep(10);
		System.out.println(t.i);
		t.i=20;
		util.sleep(60);
		System.out.println(t.i);
		t.i=30;
	}
}
class thread2 extends Thread
{
	test t;
	thread2(test t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println(t.i);
		t.i=40;
		util.sleep(40);
		System.out.println(t.i);
		t.i=50;
		util.sleep(100);
		System.out.println(t.i);
		t.i=60;
	}
}
public class Manager
{
	public static void main(String[] args)
	{
	test t=new test();
	t.i=70;
	thread1 t1=new thread1(t);
	thread2 t2=new thread2(t);
	t1.start();
	util.sleep(5);
	t2.start();
	util.sleep(500);
	System.out.println(t.i);
	}
}
