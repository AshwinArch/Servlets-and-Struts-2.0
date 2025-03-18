/**
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Ashwin
 *
 */
public class A25
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
		lit.add(111);                     ////it will add (111) left to the Cursor/Pointer.......
		
//////////it will print all element in forward direction////////
		System.out.println("Forward Direction");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
		System.out.println();	
		
////////it will print all element in backward direction..........
		System.out.println("Reverse Direction");
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+",");
		}
		System.out.println();
		
/////again it will print all element in forward direction .......
		System.out.println("Forward Direction");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
		System.out.println();	
	}
}
