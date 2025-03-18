package class1;
class A
{
	int i;
}
public class A00
{
	public static void main(String[] args)
	{
		int i=10;
		System.out.println(i);
		A a1=new A();
		System.out.println(a1);
		System.out.println(a1.i);
		a1.i=10;
		System.out.println(a1);
		System.out.println(a1.i);
	}
}
