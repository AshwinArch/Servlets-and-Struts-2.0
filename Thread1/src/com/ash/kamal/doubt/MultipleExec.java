/**
 * 
 */
package com.ash.kamal.doubt;

/**
 * @author Diesel
 *
 */
public class MultipleExec 
{
	public static void main(String arg[])
	{
		thread1 th=new thread1();
		test t=new test();
		th.start();
		try
		{
			th.sleep(2);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		t.start();
	}
}
class test extends Thread
{
 /* (non-Javadoc)
 * @see java.lang.Thread#run()
 */
@Override
public void run()
{
  for (int i = 0; i < 1000; i++)
{
	  System.out.println("test1");
}
}
}                               //////here we are using one global test object.it will reflect changes from 
													//anywhere to any threads......

class thread1 extends Thread
{
	public void run()
	{
		for (int i = 10000; i >0; i--)
		{
			System.out.println("test 2");
		}
	}
}