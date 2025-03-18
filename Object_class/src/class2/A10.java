package class2;
class T
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof T))
		{
			return  false;
		}
		return i==((T)obj).i;
	}
}
class U extends T
{
	int j;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof U))
		{
			return  false;
		}
		return super.equals(obj) && j==((U)obj).j;
	}
}
public class A10
{
	public static void main(String[] args)
	{
		U u1=new U();
		u1.i=10;
		u1.j=20;
		U u2=new U();
		u2.i=10;
		u2.j=20;
		System.out.println(u1.equals(u2));
	}
}
