package priority;

public class A00
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getPriority());
	}
}
