/**
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 * @author Ashwin
 *       reading and removing.........
 */
public class A17
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(10);
		System.out.println(list);
		System.out.println(list.remove(1));    /// 1st  method...
		System.out.println(list);
		Object obj=list.remove(new Integer(90));         ///2nd method...
		System.out.println(obj);
		System.out.println(list);
	}
}
