package naming;

class E extends Thread
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
class A03
{
	public static void main(String[] args)
	{
		E e1=new E();
		e1.run();
		e1.start();
	}
}