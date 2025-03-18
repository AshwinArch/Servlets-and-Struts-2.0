/**
 * 
 */
package topic_wise.search;

import java.util.PriorityQueue;

/**
 * @author Ashwin
 *
 */
public class queue
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(100);
		queue.add(90);
		queue.add(10);
		queue.add(9);
		
		PriorityQueue queue1=new PriorityQueue();
		queue1.add(100);
		queue1.add(90);
		System.out.println(queue.containsAll(queue1));
	}
}
