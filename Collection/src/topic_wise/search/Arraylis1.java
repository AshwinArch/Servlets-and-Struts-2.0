/**
 * 
 */
package topic_wise.search;

import java.util.ArrayList;

/**
 * @author Ashwin
 *
 */
public class Arraylis1
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(910);
		System.out.println(list.contains(9));
		System.out.println(list.contains(91));
		
		list.add(910);
		list.add(920);
		list.add(930);
		
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(910);
//		list1.add(999);
		
		System.out.println(list.containsAll(list1));
		
	}
}
