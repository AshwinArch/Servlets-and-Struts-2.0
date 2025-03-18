package sync;
class shared
{
	void test1()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	void test2()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	synchronized void test3()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	synchronized void test4()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	static void test5()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	static void test6()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	synchronized static void test7()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	synchronized static void test8()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class thread1 extends Thread
{
	shared s1=null;
	thread1(shared s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		s1.test4();
	}
}
class thread2 extends Thread
{
	shared s1=null;
	thread2(shared s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		s1.test5();
	}
}
public class A00
{
	public static void main(String[] args)
	{
		shared s1=new shared();
		thread1 t1 = new thread1(s1);
		thread2 t2=new thread2(s1);
		t1.start();
		t2.start();
	}
}
