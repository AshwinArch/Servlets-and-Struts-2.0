/**
 * 
 */
package class3;

/**
 * @author Thread-Group example.....
 *
 */
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager4
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.start();
		A a2=new A();
		a2.start();
		B b1=new B();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		t1.start();
		t2.start();
	}
}
