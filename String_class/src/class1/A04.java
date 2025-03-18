package class1;

class A
{
	int i;
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
}
public class A04
{
	public static void main(String[] args)
	{
		A a=new A();
		a.i=100;
		System.out.println(a.hashCode());
		A a2=new A();
		a2.i=100;
		System.out.println(a2.hashCode());
	}
}
