package intercomm;
import org.omg.CORBA.PUBLIC_MEMBER;

class E
{
	synchronized void method1()
	{
		System.out.println("Method1-started");
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Method1-End");
	}
	// at the time of notify all this method2 will keep main lock so it will give after full execution...
	//to wait() and release wait method... 
	//
	synchronized void method2()
	{
		notifyAll();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class F extends Thread
{
	E e1=null;
	
	F(E e1)
	{
		this.e1=e1;
	}
	public void run()
	{
		e1.method1();
	}
}
public class Manager2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		E e1=new E();
		F f1=new F(e1);
		f1.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException ez)
		{
			ez.printStackTrace();
		}
		e1.method2();
	}
}
