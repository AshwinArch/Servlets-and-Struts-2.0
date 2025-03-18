package class2;
class A
{
	int i;
	String s;
}
public class A13
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.i=10;
		System.out.println(a1.hashCode());
		A a2=new A();
		a2.i=10;
		a1.s="abc";
		a2.s="xyz";
		System.out.println(a1.s.compareTo(a2.s));
		System.out.println(a1.s.hashCode());
		System.out.println(a2.hashCode());
	}
}
