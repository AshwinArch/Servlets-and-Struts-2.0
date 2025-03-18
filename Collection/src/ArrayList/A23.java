package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Ashwin         ITERATOR
 */
public class A23
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
		System.out.println(list);
		
//		list.add(101);                    //we should not add anything to list after iterator...
//		System.out.println(list);           ///otherwise it will give java.util.ConcurrentModificationException...
		
///		it.remove();                            //we cant pass remove method before hasnext and next operation.....
				
		while(it.hasNext())                      /// will check elements is there or not
		{
///			it.remove();            ///if we are passing remove before next then it will give java.lang.IllegalStateException
			System.out.println(it.next());                 // 1 . read element 2 . remove cursor to next element.
			it.remove();
		}
				
		System.out.println(list);
		System.out.println("----------------");
	}
}
