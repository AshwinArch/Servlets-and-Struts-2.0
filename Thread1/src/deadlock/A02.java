package deadlock;
class E
{                                      // Dead-lock condition......
	synchronized void test1(E e1)
	{
		System.out.println("Test1-Start");
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		e1.test2(this);
		System.out.println("Test1-End");
	}
	synchronized void test2(E e1)
	{
		System.out.println("Test2-Start");
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		e1.test1(this);
		System.out.println("Test2-End");
	}
}
class F extends Thread
{
	E e1,e2;
	F(E e1,E e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	public void  run()
	{
		e1.test1(e2);
	}
}
class G extends Thread
{
	E e1,e2;
	G(E e1,E e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	public void  run()
	{
		e2.test2(e1);
	}
}
public class A02
{
	public static void main(String[] args)
	{
		E e1=new E();
		E e2=new E();
		F f1=new F(e1,e2);
		G g1=new G(e1,e2);
		f1.start();
		g1.start();
	}
}