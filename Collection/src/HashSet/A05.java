package HashSet;

import java.util.HashSet;

/**
 * @author Ashwin
 *   adding in hashset.........
 */
public class A05
{
	public static void main(String[] args)
	{
		HashSet set=new HashSet();
		set.add("abc");                          ///3rd method
		set.add("abc");
		set.add("abc");
		
		HashSet set1=new HashSet();
		set1.add("xyz");
		set1.addAll(set);                                ///1st method.......
		
		HashSet set2=new HashSet(set1);         /////// 2nd method....
		set2.add("xyz");
		
		System.out.println(set);
		System.out.println(set1);
		System.out.println(set2);
	}
}
