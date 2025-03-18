package LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
/**
 * @author Ashwin
 *      operations  from linkedlist
 */
public class A00
{
	public static void main(String[] args)
	{
		LinkedList a=new LinkedList();
	//	a.add(90);
	//	a.add(90.06);
	//  a.add(90);
		a.add("abc");                   /// Adding lement in Arraylist...
		a.add("xyz");
		a.add("123");
		a.add("PQR");
		a.add("uvw");
		a.add("UVW");
		a.add("lmn");
		a.add("NMO");
		a.add("def");
	//	a.add(null);
	//	a.add(true);
		System.out.println(a.get(2));         ///    read element through index-wise....  
		System.out.println(a);                     ////it willl print full list element.    
		for(Object obj:a)                   /////    using enhance for loop........
		{
			System.out.println(obj);
		}
		Collections.sort(a);               ///sorting....
		System.out.println(a);
	}
}
