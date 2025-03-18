package ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class C
{
	int i,j,k;
	C(int i, int j, int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public String toString()
	{
		return "i= "+i+" & j= "+j+" & k = "+k;
	}
}
class SortWithI implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((C)o1).i - ((C)o2).i;
	}
}
class SortWithJ implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((C)o1).j - ((C)o2).j;
	}
}
class SortWithK implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((C)o1).k-((C)o2).k;
	}
}
public class A05
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(new C(10,2,1));
		list.add(new C(1,20,90));
		list.add(new C(100,22,7));
		list.add(new C(5,15,13));
		System.out.println("----------------");
		System.out.println(list);
		System.out.println("----------------");
		Collections.sort(list,new SortWithI());
		System.out.println(list);
		System.out.println("----------------");
		Collections.sort(list,new SortWithJ());
		System.out.println(list);
		System.out.println("-----------------");
		Collections.sort(list, new SortWithK());
		System.out.println(list);
		System.out.println("------------------");
		Collections.reverse(list);
		System.out.println(list);
	}
}
