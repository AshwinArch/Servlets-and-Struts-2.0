package intercomm;
class C
{
	synchronized void test1()
	{
		System.out.println("Test1-Start");
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Test1.End");
	}
	synchronized void test2()
	{
		notify();
	}
}
class D extends Thread
{
	C c1;
	D (C c1)
	{
		this.c1=c1;
	}
	public void run()
	{
		c1.test1();
	}
}
public class Manager1
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		C c1=new C();      // TODO Auto-generated method stub
		D d1=new D(c1);
		d1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		System.out.println("releasing");
		c1.test2();
	}

}
