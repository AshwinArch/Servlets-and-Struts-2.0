package TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class A02
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet(Collections.reverseOrder());
		set.add(150);
		set.add(100);
		set.add(50);
		set.add(250);
		set.add(200);
		System.out.println(set);
	}
}