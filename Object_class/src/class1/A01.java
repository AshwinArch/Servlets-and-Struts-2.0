package class1;
class B
{
	int i;
}
public class A01
{
	public static void main(String[] args)
	{
		B b1=new B();
		System.out.println(b1);
		System.out.println(b1.toString());
		String s1=b1.toString();
		System.out.println(s1);
	}
}
