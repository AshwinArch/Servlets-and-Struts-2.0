package class1;

public class A08
{
	public static void main(String[] args)
	{
		class A extends Thread implements Runnable
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		}
		A p1=new A();
		p1.start();
		Thread a=new Thread(p1);
		a.start();
		for(int i=1000;i<2000;i++)
		{    System.out.println(i);
		}
	}
}
