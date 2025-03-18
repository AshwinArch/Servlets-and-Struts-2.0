/**
 * 
 */
package topic_wise.sublist;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ashwin
 *
 */
public class Treeset1
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet();
		set.add(90);
		set.add(9);
		set.add(0);
		set.add(80);
		set.add(30);
		set.add(50);
		set.add(40);
		System.out.println(set);
		Set set1=set.subSet(30, 80);//set type
		System.out.println(set);
		System.out.println(set1);
		Set set2=set.subSet(30, true, 80, true);            ///navigable type
		System.out.println(set2);
		
		System.out.println(set.ceiling(55));
		System.out.println(set.floor(55));
	}
}
