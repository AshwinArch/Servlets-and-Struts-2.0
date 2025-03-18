/**
 * 
 */
package ArrayList;
import java.util.ArrayList;
/**
 * @author Ashwin
 *       reading arraylist element by for loop and enhance for loop............
 */
public class A13
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(10);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		for(Object obj: list)
		{
			System.out.print(obj+",");
		}
		System.out.println();
		System.out.println(list.get(2));
	}
}


