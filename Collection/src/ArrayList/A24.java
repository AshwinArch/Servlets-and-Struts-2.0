/**
 * 
 */
package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Ashwin          ListIterator
 *
 */
public class A24
{	
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(910);
		list.add(290);
		list.add(6);
		ListIterator lit=list.listIterator();
		System.out.println("Forward Direction");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
		System.out.println();	
		System.out.println("Reverse Direction");
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+",");
		}
		System.out.println();
		System.out.println("Forward Direction");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
		System.out.println();
	}
}
