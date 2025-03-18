package class1;
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class A02
{
	public static void main(String[] args)
	{		
		Thread2 t1=new Thread2();
		Thread t=new Thread(t1);
		t.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}