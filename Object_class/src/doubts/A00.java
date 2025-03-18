package doubts;

public class A00 extends Thread
{
	public static void main(String[] args) throws InterruptedException
	{
		A00 a=new A00();
		a.start();
		a.join();
		System.out.println("terminated");
		System.out.println(a.getName());
	}
	public void run()
	{
		System.out.println("Run");
		
	}
}
