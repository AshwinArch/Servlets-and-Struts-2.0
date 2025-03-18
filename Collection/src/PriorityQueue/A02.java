package PriorityQueue;
import java.util.PriorityQueue;
class B
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i = "+i;
	}
}
public class A02
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(new B(10));
		queue.add(new B(1));
		queue.add(new B(11));
		queue.add(new B(4));
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}
