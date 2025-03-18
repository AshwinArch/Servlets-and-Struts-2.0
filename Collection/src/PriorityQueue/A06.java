/**
 * 
 */
package PriorityQueue;
import java.util.PriorityQueue;
/**
 * @author Ashwin
 *			Adding element in priority queue only 2 methods are there..
 */
public class A06
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(123);
		queue.add(10);
		queue.add(20);
		queue.add(125);
		PriorityQueue queue1=new PriorityQueue();
		queue1.addAll(queue);            /////////   1st method.......
		queue.add(123);
		queue1.add(1200);
		queue1.add(101);
		System.out.println("Queue 1 : "+queue);
		System.out.println("Queue 2 : "+queue1);
		
		PriorityQueue queue2 =new PriorityQueue(queue1);                ///////2nd method.....
		queue2.add(300);
		System.out.println("Queue 3 : "+queue2);
	}
}
