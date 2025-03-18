package class2;
class R
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof R))
		{
			return  false;
		}
		return i==((R)obj).i;
	}
}
class S
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof S))
		{
			return  false;
		}
		return i==((S)obj).i;
	}
}
public class A09
{
	public static void main(String[] args)
	{
		R r1=new R();
		r1.i=10;
		R r2=new R();
		r2.i=20;
		S s1=new S();
		s1.i=10;
		S s2=new S();
		s2.i=10;
		System.out.println(r1.equals(r2));
		System.out.println(s1.equals(s2));
		System.out.println(r1.equals(s1));
		System.out.println(s1.equals(r1));
	}
}
