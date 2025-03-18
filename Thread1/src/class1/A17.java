package class1;
public class A17 extends Thread
{
	void startThread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		A17 p1=new A17();
		p1.startThread();
		for(int i=0;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}

