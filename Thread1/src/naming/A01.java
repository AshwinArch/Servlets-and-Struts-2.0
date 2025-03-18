package naming;
public class A01
{
	public static void main(String[] args)
	{
		Manager4 m1=new Manager4();
		m1.start();
		m1.run();
	}
}
class Manager4 extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(getId()+" : "+i);
		}
	}
}
