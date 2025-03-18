package sleep;

public class A04
{
	public static void main(String[] args)
	{
		A3 a=new A3();
		a.start();
		a.start();
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
class A3 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
		System.out.println(i);
		}
	}	
}
