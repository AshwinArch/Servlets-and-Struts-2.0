package PriorityQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class SortWithI implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((D)o1).i-((D)o2).i;
	}
}
class SortWithJ implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((D)o1).j-((D)o2).j;
	}
}
class D
{
	int i,j;
	D(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "i = "+i+ " & j = "+j;
	}
}
public class A04
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue(4, new SortWithI());
		queue.add(new D(10,1));
		queue.add(new D(1,12));
		queue.add(new D(11,0));
		queue.add(new D(4,7));
		
		PriorityQueue queue1=new PriorityQueue(4,Collections.reverseOrder(new SortWithJ()));
		queue1.addAll(queue);  
				
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());              //////it will read head element.................
		System.out.println(queue.poll());              /////it will read and remove head element..........
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue1);
		System.out.println(queue1.poll());
		System.out.println(queue1.peek());                         //////it will read head element................
		System.out.println(queue1.poll());                           /////it will read and remove head element..........
		System.out.println(queue1.peek());
		System.out.println(queue1);
	}
}

