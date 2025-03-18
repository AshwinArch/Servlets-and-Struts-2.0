package sleep;

public class A05
{
	public static void main(String[] args)
	{
		A4 a=new A4();
		a.start();
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
class A4 extends Thread
{
	public void run()
	{
		int i=10/0;
		for(i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}