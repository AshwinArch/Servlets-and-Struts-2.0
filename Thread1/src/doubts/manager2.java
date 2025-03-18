package doubts;

public class manager2
{
	public static void main(String[] args)
	{
		thread2 t2=new thread2();
		Thread t=new Thread(t2);
		t.start();
		int i=100/0;
	}
}
class thread2 extends Thread
{
	public void  run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}