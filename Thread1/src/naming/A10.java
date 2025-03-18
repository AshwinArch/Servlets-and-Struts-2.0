package naming;

public class A10
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		t1.setName("MAin");
		D d1=new D();
		d1.run();
		d1.start();
	}
}
class D1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}

