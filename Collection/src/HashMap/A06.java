package HashMap;

import java.util.HashMap;

class D
{
	int i;
	D(int i)
	{
		this.i=i;
	}
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		return (obj instanceof D) && i==((D)obj).i ;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "i="+i;
	}
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return Integer.toString(i).hashCode();
	}
}

public class A06
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put(new D(1), "xyz");
		map.put(new D(1), "xyz");
		map.put(new D(1), "xyz");
		map.put(new D(1), "xyz");
		map.put(new D(2), "abc");
		map.put(new D(3), "def");
		System.out.println(map);
		
	}
}
