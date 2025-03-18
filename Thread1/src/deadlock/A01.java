package deadlock;
class B
{
	
	void test()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		Object o1=new Object();
		synchronized(o1)
		{
			for(int i=1000;i<2000;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		}
		for(int i=2000;i<3000;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
class ThreadA extends Thread
{
	B b1=null;
	ThreadA(B b1)
	{
		this.b1=b1;
	}
	public void run()
	{
		b1.test();
	}
}
class ThreadB extends Thread
{
	B b1=null;
	ThreadB(B b1)
	{
		this.b1=b1;
	}
	public void run()
	{
		b1.test();
	}
}
public class A01
{
	public static void main(String[] args)
	{
		B b1=new B();
		B b2=new B();
		Thread t1=new ThreadA(b1);
		Thread t2=new ThreadB(b1);
		t1.start();
		t2.start();
	}
}
