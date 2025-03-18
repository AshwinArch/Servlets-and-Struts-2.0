/**
 * 
 */
package topic_wise.sublist;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ashwin
 *
 */
public class Hashmap1
{
	public static void main(String[] args)
	{
		TreeMap map1=new TreeMap();
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map1.put("key3", "value3");
		map1.put("key4", "value4");
		Map map2=map1.subMap("key1", "key3");
		System.out.println(map1);
		System.out.println(map2);
		Map map3=map1.subMap("key1", true, "key3", true);
//		System.out.println(map1);
		System.out.println(map3);
		
	}
}
