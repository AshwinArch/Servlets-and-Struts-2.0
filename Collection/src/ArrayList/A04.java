package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class A04
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(new B(10));
		list.add(new B(90));
		list.add(new B(20));
		list.add(new B(70));
		System.out.println(list);
/*		                these statement are never work until { class A implements comparable } 
		                    b'coz derived Data have to implements comparable for using Collections.sort           */
		Collections.sort(list);
		System.out.println(list); 
	}
}
class B implements Comparable
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public int compareTo(Object obj)
	{
		return i-((B)obj).i; 
	}
	public String toString()
	{
		return "i = "+i;
	}
}
