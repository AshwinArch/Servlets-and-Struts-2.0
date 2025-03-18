package priority;

public class A01
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
/*		t1.setPriority(9);
		System.out.println(t1.getPriority());                 */
	}
}
// we can not set thread priority more then 10 or less than 1.
// it should be 1->10 only otherwise it will show java.lang.IllegalArgumentException.