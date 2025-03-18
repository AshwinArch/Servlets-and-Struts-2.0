package PriorityQueue;

import java.util.HashSet;
import java.util.PriorityQueue;

public class A08
{
	public static void main(String[] args)
	{
		PriorityQueue queue=new PriorityQueue();
		queue.add(new B1(90));
		queue.add(new B1(90));
		queue.add(new B1(900));
		queue.add(new B1(901));
		queue.add(new B1(89));
		queue.add(new B1(91));
		System.out.println(queue);
		queue=new PriorityQueue(new HashSet(queue));
		System.out.println(queue);
	}
}
class B1 implements Comparable
{
	int i;
	B1(int i)
	{
		this.i=i;
	}
	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return i-((B1)o).i;
	}
	public String toString()
	{
		return "i = "+i;
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		return (obj instanceof B1) && (((B1)obj).i==i);
	}
}