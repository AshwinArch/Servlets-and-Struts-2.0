package HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class A02
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("abc","xyz");
		map.put("123", "789");
		map.put("wxy", "def");
		map.put("def", "mno");
		System.out.println(map);
		
		TreeMap map1=new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}
