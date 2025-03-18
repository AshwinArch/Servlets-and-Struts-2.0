package HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
public class A04
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put(new A1(10,20),"xyz");
		map.put(new A1(101,200), "789");
		map.put(new A1(104,20), null);
		map.put(new A1(11,2), true);
		map.put(new A1(2,192), false);
		map.put(new A1(10,200), "abc");
		System.out.println(map);
		
		TreeMap map1=new TreeMap(new SortWithM());
		map1.putAll(map);
		System.out.println(map1);
		
		TreeMap map2=new TreeMap(new SortWithN());
		map2.putAll(map);
		System.out.println(map2);
	}
}
class A1
{
	int m,n;
	A1(int m, int n)
	{
		this.m=m;
		this.n=n;
	}
	public String toString()
	{
		return "m = "+m+"& n = "+n;
	}
}
class SortWithM implements Comparator
{
	 public int compare(Object o1,Object o2)
	 {
		 return ((A1)o1).m-((A1)o2).m;
	 }
}
class SortWithN implements Comparator
{
	 public int compare(Object o1,Object o2)
	 {
		 return ((A1)o1).n-((A1)o2).n;
	 }
}