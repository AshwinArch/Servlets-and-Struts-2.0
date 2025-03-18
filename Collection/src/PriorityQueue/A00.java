package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;


public class A00
{
	public static void main(String[] args)
	{
		PriorityQueue a=new PriorityQueue();
		a.add(90);
	//	a.add(90.06);
	    a.add(900);
	    a.add(89);
	    a.add(1);
	    a.add(120);
	    a.add(120);
	    a.add(110);
	    a.add(1300);
	    a.add(1110);
	    
	//    a.add(null);
/*		a.add("abc");
		a.add("xyz");
		a.add("123");
		a.add("PQR");
		a.add("uvw");
		a.add("UVW");
		a.add("lmn");
		a.add("NMO");
		a.add("def");
		a.add(null);
		a.add(true);*/
		System.out.println(a);
		for(Object obj:a)
		{
			System.out.println(obj);
		}
	//	Collections.sort(a);
		System.out.println(a);
	}
}
