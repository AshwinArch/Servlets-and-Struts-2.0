package ArrayList;

import java.util.ArrayList;
/* 2nd adding method : - we can add element in list */
public class A09
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(1);
		ArrayList list1=new ArrayList(list);
		list1.add(110);
		list.add(10);
		System.out.print("List 1: ");
		System.out.println(list);
		System.out.print("List 2: ");
		System.out.println(list1);
	}
}
