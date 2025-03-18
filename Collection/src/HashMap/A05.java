package HashMap;

import java.util.HashMap;

public class A05
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("abc", "xyz");
		map.put("abc", "xyz");
		map.put("def", true);
		map.put("def", true);
		map.put(null, 123);
		map.put("123", "abc");
		map.put("xyz", false);
		map.put(false, 90.40);
		map.put(false, 90.40);
		System.out.println(map);
	}
}
