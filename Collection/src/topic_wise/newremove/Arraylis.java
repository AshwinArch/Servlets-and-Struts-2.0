/**
 * 
 */
package topic_wise.newremove;

import java.util.LinkedList;

/**
 * @author Ashwin
 *
 */
public class Arraylis
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(910);
		list.add(910);
		list.add(920);
		list.add(930);
		list.add(940);
		list.add(950);
		list.add(960);
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirstOccurrence(910));
		System.out.println(list.removeLastOccurrence(0));
		System.out.println(list.removeLast());
		System.out.println(list.remove());
		System.out.println(list.poll());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list.pop());                  ///it will remove & return the first element of list.....
		
		System.out.println(list);
		
	}
}
/*90
true
true
960
9
910
920
950
930
[940]*/