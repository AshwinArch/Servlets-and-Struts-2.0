package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import javax.sound.sampled.ReverbType;

public class A023
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("xyz");
		list.add("abc");
		list.add("123");
		list.add("pqr");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
