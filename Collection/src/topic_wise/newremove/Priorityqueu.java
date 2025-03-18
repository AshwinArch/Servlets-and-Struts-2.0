/**
 * 
 */
package topic_wise.newremove;

import java.util.PriorityQueue;

/**
 * @author Ashwin
 *
 */
public class Priorityqueu
{
	public static void main(String[] args)
	{
		PriorityQueue queue=null;
		queue=new PriorityQueue();
		queue.add(10);
		queue.add(0);
		queue.add(1);
		queue.add(5);
//		System.out.println(queue.poll());
//		System.out.println(queue);
		
///		System.out.println(queue.remove());
//		System.out.println(queue);
		
		System.out.println(queue.removeAll(queue));
		System.out.println(queue);

	}
}
