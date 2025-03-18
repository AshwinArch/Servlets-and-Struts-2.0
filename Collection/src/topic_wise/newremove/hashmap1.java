/**
 * 
 */
package topic_wise.newremove;

import java.util.HashMap;

/**
 * @author Ashwin
 *
 */
public class hashmap1
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
//		System.out.println(map.remove("key2"));
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}
}
