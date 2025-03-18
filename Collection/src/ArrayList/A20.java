package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Ashwin
 *       reading element from arraylist...........
 */
public class A20
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(10);
		Object all[]=list.toArray();           /////mean's : - {90, 0, 9, 10}
		System.out.println(Arrays.toString(all));
	}
}
