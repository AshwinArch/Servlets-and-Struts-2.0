package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class A01
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(100);
		queue.add(10);
		queue.add(1);
		queue.add(99);
		queue.add(25);
		System.out.println(queue);
//		Collections.sort(queue);                     ////Not Applicable
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}
