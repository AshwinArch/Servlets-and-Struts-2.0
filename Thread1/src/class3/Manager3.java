/**
 * 
 */
package class3;

/**
 * @author usage of thread group...............
 *
 */
public class Manager3
{
	public static void main(String[] args)
	{
		ThreadGroup tg=new ThreadGroup("g1");
		thread12 t1=new thread12(tg);
		thread21 t2=new thread21();
		Thread th1=new Thread(tg,t1);
		Thread th2=new Thread(tg,t2);
		thread12 t4=new thread12(tg);
		t1.start();
		th1.start();
		th2.start();
		t4.start();
		
	}
}
class thread12 extends Thread
{
	ThreadGroup tg;
	thread12(ThreadGroup tg)
	{
		// TODO Auto-generated constructor stub
		this.tg=tg;
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class thread21 implements Runnable
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
