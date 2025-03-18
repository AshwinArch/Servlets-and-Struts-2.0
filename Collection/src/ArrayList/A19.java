package ArrayList;
import java.util.ArrayList;
/**
 * @author Ashwin
 *   size method :---Returns the number of elements in this list.
 */
public class A19
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(10);
		System.out.println(list);
		for(int i=0;i<list.size();)
		{
			System.out.println(list.remove(i));
		}
		System.out.println(list);
	}
}
