package Vector;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class A00
{
	public static void main(String[] args)
	{
		Vector a=new Vector();
		a.add(90);
		a.add(90.06);
	    a.add(90);
		a.add("abc");
		a.add("xyz");
		a.add("123");
		a.add("PQR");
		a.add("uvw");
		a.add("UVW");
		a.add("lmn");
		a.add("NMO");
		a.add("def");
		a.add(null);
		a.add(true);
		System.out.println(a.get(3));
		System.out.println(a);
		for(Object obj:a)
		{
			System.out.println(obj);
		}
//		Collections.sort(a);
		System.out.println(a);
	}
}