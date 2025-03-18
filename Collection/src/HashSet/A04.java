package HashSet;

import java.util.HashSet;

class C
{
	int i,j;
	C(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return " ( i = "+i+" & j = "+j+" ) ";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode()+Integer.toString(j).hashCode();
	}
	public boolean equals(Object obj)
	{
		return (obj instanceof C) && (i==((C)obj).i) && (j==((C)obj).j);
	}
}
public class A04
{
	public static void main(String[] args)
	{
		HashSet set=new HashSet();
		set.add(90);
		set.add(90);
		set.add("abc");
		set.add("abc");
		set.add(new C(1, 1));
		set.add(new C(1, 1));
		set.add(new C(1, 2));
		set.add(new C(2, 1));
		System.out.println(set);
	}
}