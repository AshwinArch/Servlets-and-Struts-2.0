package class1;
public class A05
{
	static class A implements Runnable
	{
		public void run()
		{
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		A p1=new A();
		Thread a=new Thread(p1);
		a.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
