package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class A00
{
	public static void main(String[] args)
	{
		Hashtable a=new Hashtable();
		a.put("xyz","abc");
		a.put("xyz","abc");
		a.put(123,"abc");
		a.put(90.0,"abc");
		a.put(true,90.004);
		a.put(false,90.90);
	//	a.put(null,12345);
	//	a.put(12345,null);
		a.put("MNO","abc");
		a.put("def","abc");
		a.put("abc",false);
		System.out.println(a.get(true));
		System.out.println(a);
	//	TreeMap t=new TreeMap(a);
	//	System.out.println(t);
	}
}