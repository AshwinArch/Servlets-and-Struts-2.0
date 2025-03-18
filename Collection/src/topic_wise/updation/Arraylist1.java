/**
 * 
 */
package topic_wise.updation;

import java.util.ArrayList;

/**
 * @author Ashwin
 *  in priorityqueue and set there is no method of updating existing element just bcoz of indexing...
 */
public class Arraylist1
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(910);
		System.out.println(list);
		list.set(2,"new");
		System.out.println(list);           //updation is happening on 2nd position......
	}
}
