package class1;
class Thread23 extends Thread implements Runnable
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class A03
{
	public static void main(String[] args)
	{		
		Thread23 t1=new Thread23();
		t1.start();
		Thread t=new Thread(t1);
		t.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
