package HashMap;

import java.util.HashMap;

public class A01
{
	public static void main(String[] args)
	{
		HashMap a=new HashMap();
		a.put("xyz","abc");/// this key will imposed by next one.....
		System.out.println(a.put("xyz","adec"));
		System.out.println(a);
//		a.put(123,"abc");
	}
}
