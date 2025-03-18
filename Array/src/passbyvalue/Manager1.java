package passbyvalue;

public class Manager1
{
	public static void main(String[] args)
	{
		class A
		{
			int i = 10;
			// System.out.println(i);
		}
		A all[] = new A[4];
		all[0] = new A();
		all[1] = new A();
		all[2] = new A();
		all[3] = new A();//array size will be starting in index is zero...
		//all[4] = new A();//ArrayIndexOutOfBoundsException:
		// all[5]=new A();
		System.out.println("done");
	}
}