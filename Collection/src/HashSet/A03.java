package HashSet;

import java.util.HashSet;

public class A03
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(100);
		set.add(100);
		set.add("abc");
		set.add("abc");
		set.add(10);
		set.add(10.90);
		set.add(true);
		System.out.println(set);
		
	}
}
