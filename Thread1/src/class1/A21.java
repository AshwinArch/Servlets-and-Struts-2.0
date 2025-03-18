package class1;
class A21 extends Thread implements Runnable
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class Manager1
{
	public static void main(String[] args)
	{
		A21 a1=new A21();
		a1.run();
		Thread t1=new Thread(a1);
		t1.run();
		t1.start();
	}
}
