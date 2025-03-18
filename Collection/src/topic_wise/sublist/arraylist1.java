package topic_wise.sublist;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Ashwin
 *
 */
public class arraylist1
{
	public static void main(String[] args)
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(9);
		list1.add(10);
		list1.add(100);
		list1.add(110);
		list1.add(120);
		list1.add(130);
		System.out.println(list1);
//		ArrayList list2=(ArrayList)list1.subList(0, 2);
		List list2=list1.subList(0, 3);
		System.out.println(list2);
	}
}
