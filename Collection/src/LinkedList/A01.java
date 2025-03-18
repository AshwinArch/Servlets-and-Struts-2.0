package LinkedList;
import java.util.LinkedList;
/**
 * @author Ashwin
 *      reading from linkedlist
 */
public class A01
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.add(100);
		list.add(10);
		list.add(90);
		list.add(9);
		System.out.println(list);
		System.out.println(list.peek());                          // it will read only head element..
		System.out.println(list.poll());                          //it will read and remove head element....
		System.out.println(list);
	}
}