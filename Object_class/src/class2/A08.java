package class2;
class P{}
class Q
{
	int i;
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Q))
		{
			return false;
		}
		return i==((Q)obj).i;
	}
}
public class A08
{
	public static void main(String[] args)
	{
		Q q1=new Q();
		q1.i=100;
		Q q2=new Q();
		q2.i=100;
		System.out.println(q1.equals(q2));
		P p1=new P();
		System.out.println(q1.equals(p1));
	}
}
