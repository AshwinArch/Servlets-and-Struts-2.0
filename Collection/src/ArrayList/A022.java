package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A022
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(0);
		list.add(110);
		list.add(90);
		System.out.println(list);
		Collections.reverse(list);                       ////it will reverse our list order.........
		System.out.println(list);
		Collections.sort(list);                           /////it will sort our list element....
		System.out.println(list);
	//	Collections.reverse(list);
		Collections.sort(list,Collections.reverseOrder());           ///  it will sort and reverse to our list order...........
		System.out.println(list);
	}
}
