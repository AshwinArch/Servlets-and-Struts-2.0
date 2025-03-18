package class2;
class N
{
	int i;
	public boolean equals(Object obj)
	{
		N n=(N)obj;
		return i==n.i;
	}
}
public class A07
{
	public static void main(String[] args)
	{
		N n1=new N();
		n1.i=10;
		N n2=new N();
		n2.i=100;
		System.out.println(n1.equals(n2));
	}
}
