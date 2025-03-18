/**
 * 
 */
package HashSet;

import java.util.HashSet;

/**
 * @author Ashwin
 *       hashset element reading by enhance for loop...
 */
public class A06
{
	public static void main(String[] args)
	{
		HashSet set=new HashSet();
		set.add(90);
		set.add(9);              //adding element in hashset.....
		set.add(0);
		set.add(100);
		System.out.println(set);
		for(Object obj:set)                             //only for enhance loop allowed b'coz of indexing ...
		{
			System.out.println(obj);
		}
	}
}
