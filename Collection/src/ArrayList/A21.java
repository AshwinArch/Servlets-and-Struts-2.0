package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *                       Iterator
 * @author Ashwin
 */
public class A21
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(910);
		list.add(290);
		Iterator it=list.iterator();                //we can iterator element only once of collection type only...
		Iterator it1=list.iterator();
		while(it.hasNext())                      /// will check elements is there or not
		{
			System.out.println(it.next());                 // 1 . read element 2 . remove cursor to next element.
		}
		System.out.println("----------------");
		while(it.hasNext())                      /// will check elements is there or not
		{
			System.out.println(it.next());                 // 1 . read element 2 . remove cursor to next element.
		}
		System.out.println("----------------");
		while(it.hasNext())                      /// will check elements is there or not
		{
			System.out.println(it.next());                 // 1 . read element 2 . remove cursor to next element.
		}
		System.out.println("----------------");
	}
}
