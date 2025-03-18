package PriorityQueue;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
public class A05
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(90);
		queue.add(901);
		queue.add(90);
		queue.add(901);
	//	queue.add(90.0);
//		queue.add(90.0);
//		queue.add("abc");                          /////java.lang.ClassCastException:.....data type should be comparable  type.......
//		queue.add("abc");                             /// we can't done sorting like this....no null............mutually comparable.........
		System.out.println(queue);
		
		queue=new PriorityQueue(new HashSet(queue));
		System.out.println(queue);
	}
}
