/**
 * 
 */
package topic_wise.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(190);
		Enumeration enum1=Collections.enumeration(list);
		while (enum1.hasMoreElements())
		{
			System.out.println(	 enum1.nextElement());
		}
	}
}
