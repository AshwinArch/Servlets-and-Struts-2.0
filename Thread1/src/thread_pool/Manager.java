/**
 * 
 */
package thread_pool;
import java.util.Vector;
import javax.sql.rowset.spi.SyncFactory;

/**
 * @author Thread-pool.....
 *
 */
class A
{
	synchronized void gotowait()
	{
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	synchronized void releasefromwait()
	{
		notify();
	}
}
class thread1 extends Thread
{
	A a1=null;
	public thread1(A a1)
	{
		this.a1=a1;
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		while(true)
		{
			a1.gotowait();
			System.out.println(Thread.currentThread().getName()+"is doing something");
			try
			{
				sleep(500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"finished its activity");
			a1.releasefromwait();
		}
	}
}
class poolManager
{
	private Vector<thread1> pool=new Vector<thread1>();
	void init()
	{
		thread1 t1=null;
		A a1=null;
		for(int i=0;i<10;i++)
		{
			a1=new A();
			t1=new thread1(a1);
			t1.start();
			pool.add(t1);
		}
		System.out.println("pool is initialized");
	}
	thread1 getThread()
	{
		thread1 t1=null;
		if(pool.size()>0)
		{
			t1=pool.remove(0);
		}
		else
		{
			A a1=new A();
			t1=new thread1(a1);
			t1.start();
		}
		return t1;
	}
	void setThread(thread1 t1)
	{
		if(pool.size()<10)
		{
			pool.add(t1);
		}
		else
		{
			t1.stop();
		}
	}
	void releasePool()
	{
		thread1 t1=null;
		for(int i=0;i<pool.size();)
		{
			t1=pool.remove(0);
			t1.stop();
		}
		pool=null;
	}
}
class user1 extends Thread
{
	private poolManager pm=null;
	user1(poolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			thread1 t1=pm.getThread();
			t1.a1.releasefromwait();
			t1.a1.gotowait();
			pm.setThread(t1);
			
		}
	}
}
class user2 extends Thread
{
	private poolManager pm=null;
	user2(poolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			thread1 t1=pm.getThread();
			t1.a1.releasefromwait();
			t1.a1.gotowait();
			pm.setThread(t1);
			
		}
	}
}
public class Manager
{	
	public static void main(String[] args)
	{
	poolManager pm=new poolManager();
	pm.init();
	user1 u1=new user1(pm);
	user2 u2=new user2(pm);
	u1.start();
	u2.start();

	}
}