package ArrayList;
import java.util.ArrayList;
/**
 * @author Ashwin
 *  4th method of Adding in Arraylist.....................
 */
public class A11
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(10);
		list.add(20);
		list.add(200);
		ArrayList list1=new ArrayList();
		list1.add(300);
		list1.add(21);
		list1.add(1);
		list1.add(210);
//		list1.addAll(0,list);
//		list1.addAll(1,list);
//		list1.addAll(2,list);
//		list1.addAll(3,list);
		list1.addAll(4,list);
		System.out.println(list);
		System.out.println(list1);
	}
}
