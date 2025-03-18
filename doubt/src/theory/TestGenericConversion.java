package theory;

import java.util.LinkedList;
import java.util.List;

public class TestGenericConversion
{
	public static void main(String[] args)
	{
		List<String> list=new LinkedList<String>();
		list.add("one");
//		list.add(true);
		list.add("two");
		System.out.println(list.get(0).length());
	}

}
