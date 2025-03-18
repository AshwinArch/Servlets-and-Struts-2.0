package doubts;

public class A extends Thread
{
	public void run()
	{
		System.out.println(1);
	}
	public static void main(String[] args)
	{
		A t1=new A();
		t1.run();
		t1.run();
		t1.start();
		t1.start();
		System.out.println(2);
	}
}
//it will give java.lang.IllegalThreadStateException at runtime......