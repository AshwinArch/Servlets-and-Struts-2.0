/**
 * 
 */
package PriorityQueue;

import java.util.PriorityQueue;

/**
 * @author Ashwin
 *   priorityqueue reading through poll() and peek()...........
 */
public class A07
{
	public static void main(String[] args)
	{
		PriorityQueue queue = new PriorityQueue();
		PriorityQueue queue1=null;
		queue1=new PriorityQueue();
		queue1.add(90);
		queue1.add(0);
		queue1.add(9);
		queue1.add(10);
		System.out.println(queue1);
		System.out.println(queue1.poll());                   //read and remove  head element.....
		System.out.println(queue1.peek());                 ///only read head element...
		System.out.println(queue1.poll());
	}
}
