package class1;
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class A01
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		t1.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
