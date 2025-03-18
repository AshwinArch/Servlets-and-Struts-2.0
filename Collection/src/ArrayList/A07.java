package ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class A07
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(123);
		list.add(123);
		list.add(new Aa(90));
		list.add(new Aa(90));
		list.add("abc");
		list.add("abc");
		System.out.println(list);
		list=new ArrayList(new HashSet(list));
		System.out.println(list);
	}
}
class Aa
{
	int i;
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj) 
	{
		return i==((Aa)obj).i;
	}
	Aa(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i= "+i;
	}
}