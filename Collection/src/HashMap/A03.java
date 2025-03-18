package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import javax.sound.sampled.ReverbType;

public class A03
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put(new A(10),"xyz");
		map.put(new A(101), "789");
		map.put(new A(15), "def");
	//	map.put(new A(15), "ded");                 /// tree map will override previous value to this value 
		map.put(new A(2), "mno");
		System.out.println(map);
		
		TreeMap map1=new TreeMap();             /// 1. we can pass map elements by 2 process to map1
		map1.putAll(map);                                           /// 2. we can pass map elements by 2 process to map1
		System.out.println(map1);
		
		TreeMap map2=new TreeMap(Collections.reverseOrder());             /// 1. we can pass map elements by 2 process to map1
		map2.putAll(map1);            /// 2. we can pass map elements by 2 process to map1
		System.out.println(map2);
	}
}
class A implements Comparable
{
	int i;
	 A(int i)
	 {
		 this.i=i;
	 }
	 public String toString()
	 {
		 return "i = "+i;
	 }
	 public int compareTo(Object o1)
	 {
		 return i-((A)o1).i;
	 }
}