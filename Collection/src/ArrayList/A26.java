/**
 * 
 */
package ArrayList;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 * @author Ashwin
 *               REMOVE OPERATION...........
 */
public class A26
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(10);
		list.add(1);
		list.add(11);
		list.add(190);
		list.add("abc");
		list.add("def");
		list.add("xyz");
		System.out.println(list);
		System.out.println("Remove 2nd index : "+list.remove(2));
		System.out.println(list);
		System.out.println("Remove String-wise ( abc ): "+list.remove("abc"));
		System.out.println(list);
		System.out.println("Remove Object-wise ( 91 ) : "+list.remove(new Integer(91)));
		System.out.println(list);
		
	}
}
