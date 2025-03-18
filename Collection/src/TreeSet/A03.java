package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;
public class A03
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet();
		set.add(new A(100));
		set.add(new A(50));
		set.add(new A(150));
		set.add(new A(125));
		set.add(new A(25));
		System.out.println(set);
	}
}
class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public int compareTo(Object obj)
	{
		return i-((A)obj).i;
	}
	public String toString()
	{
		return "i = "+i;
	}
}
