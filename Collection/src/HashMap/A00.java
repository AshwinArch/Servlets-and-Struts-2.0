package HashMap;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class A00
{
	public static void main(String[] args)
	{
		HashMap a=new HashMap();
		a.put("xyz","abc");/// this key will imposed by next one.....
		a.put("xyz","adec");
//		a.put(123,"abc");
//		a.put(90.0,"abc");
//		a.put(true,90.004);
//		a.put(false,90.90);
//		a.put(null,12345);
		a.put("MNO","abc");
		a.put("def","abc");
	//	a.put(null,"abc");
		a.put("abc",null);
		a.put("acd",false);
		System.out.println(a.get(98097));
		System.out.println(a);
		TreeMap t=new TreeMap(a);
		System.out.println(t);
		 }
}
