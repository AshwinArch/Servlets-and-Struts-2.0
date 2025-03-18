package class2;
class H
{
	int i;
	public boolean equals(Object obj)
	{
		return i==((H)obj).i;
	}
}
public class A06
{
	public static void main(String[] args)
	{
		H h1=new H();
		h1.i=10;
		H h2=new H();
		h2.i=10;
		System.out.println(h1.equals(h2));
	}
}
