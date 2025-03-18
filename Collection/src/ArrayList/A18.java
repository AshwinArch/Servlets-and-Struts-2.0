package ArrayList;
import java.util.ArrayList;
/**
 * @author Ashwin
  */
public class A18
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
			System.out.println(list.remove(i));
		}
		System.out.println(list);
	}
}
