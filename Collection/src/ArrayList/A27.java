/**
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 * @author Ashwin
 *
 */
public class A27 extends ArrayList
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(10);
		list.add("xyz");
		System.out.println(list);
		ArrayList list1=new ArrayList();
		list1.add(91);
		list1.add(90);
		list1.add("xyz");
		list1.add("abc");
		list1.add(123);
		
/*		System.out.println(list1);
		list1.removeAll(list);                                   ///it will remove list element from list1.........
		System.out.println(list1);
*/
		
/*		System.out.println(list1);
		list1.retainAll(list);                                 //it will keep only same element..........
		System.out.println(list1);
*/		
		
/*		System.out.println(list1);
		list1.clear();                                           //it will remove all element from list1...............
		System.out.println(list1);
*/
		
		/*for remove range() we will have to extends arraylist class and then have to create
		 * one current class object and then we will add such element to 
		 * this object as like arraylist manner and then we can able to use remove range 
		 *  */
		A27 a=new A27();
		a.add(25);
		a.add(0);
		a.add(10);
		a.add(30);
		a.add(15);
		System.out.println(a);
		a.removeRange(0, 2);                                 //it will work index-wise........... (Inclusive, Exclusive)         
		System.out.println(a);
		System.out.println(list1);
	}
}