package PriorityQueue;
import java.util.PriorityQueue;
class C implements Comparable
{
	int i;
	public int compareTo(Object obj)
	{
		return i-((C)obj).i;
	}
	C(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i = "+i;
	}
}
public class A03
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(new C(10));
		queue.add(new C(1));
		queue.add(new C(11));
		queue.add(new C(4));
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}
