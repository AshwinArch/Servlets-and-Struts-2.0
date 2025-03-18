package naming;


class Manager2 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(getName()+" : "+i);
		}
	}
}
public class A00
{
	public static void main(String[] args)
	{
		Manager2 m1=new Manager2();
		m1.start();
		m1.run();
	}
}
