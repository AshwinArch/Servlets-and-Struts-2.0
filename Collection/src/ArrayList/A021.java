package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A021
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(0);
		list.add(110);
		list.add(90);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
