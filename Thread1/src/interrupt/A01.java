package interrupt;

import java.util.Scanner;

class B	 extends Thread
{
	public void run()
	{
		int count=0;
		while(!isInterrupted())
		{
			count++;
			System.out.println(count);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
public class A01
{
	public static void main(String[] args)
	{
		B b1=new B();
		b1.start();
		Scanner sc=new Scanner(System.in);
		String decider=null;
		do
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
				break;
			}
			System.out.println("continue counting : (Y/N)");
			decider=sc.next();
		}while("Y".equals(decider));
		b1.interrupt();
	}
}
