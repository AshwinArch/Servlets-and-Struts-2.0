package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A06
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(101);
		list.add(10);
		list.add(103);
		list.add(100);
		System.out.println(list);
		
		list=new ArrayList(new HashSet(list));
		System.out.println(list);
		
		list=new ArrayList(new LinkedHashSet(list));
		System.out.println(list);
		
		list=new ArrayList(new TreeSet(list));
		System.out.println(list);
	}
}
