package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;
public class A04
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet(new SortWithX());
		set.add(new A1(100,50));
		set.add(new A1(50,25));
		set.add(new A1(150,10));
		set.add(new A1(125,300));
		set.add(new A1(25,75));
		System.out.println(set);
		
		TreeSet set1=new TreeSet(new SortWithY());
		set1.addAll(set);
		System.out.println(set1);
	}
}
class A1
{
	int x,y;
	A1(int x,int y)
	{
		this. x= x;
		this. y= y;
	}
	public String toString()
	{
		return "x = "+x+ " & y = "+y;
	}
}
class SortWithX implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((A1)o1).x-((A1)o2).x;
	}
}
class SortWithY implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((A1)o1).y-((A1)o2).y;
	}
}
