/**
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 * @author Ashwin
 *
 */
public class A16
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("def");
		list.add("mno");
		System.out.println(list);
		System.out.println(list.remove(1));   
		System.out.println(list);
		Object obj=list.remove(new String("abc"));
		System.out.println(obj);
		System.out.println(list);
	}
}
