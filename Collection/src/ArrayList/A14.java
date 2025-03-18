/**
 * 
 */
package ArrayList;

import java.util.ArrayList;

/**
 * @author Ashwin
 *       reading and removing operation together.............
 */
public class A14
{
		public static void main(String[] args)
		{
			ArrayList list=new ArrayList();
			list.add(90);
			list.add(0);
			list.add(9);
			list.add(10);
			System.out.println(list);
			System.out.println(list.remove(0));   
			System.out.println(list.remove(1));
			System.out.println(list);
	}
}
