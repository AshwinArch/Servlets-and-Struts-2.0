/**
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 * @author Ashwin
 *         reading element from arraylist..........
 */
public class A12
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(1));
///		System.out.println(list.get(10));                ////java.lang.IndexOutOfBoundsException
		list.add(1000);
		System.out.println(list);	
	}
}
