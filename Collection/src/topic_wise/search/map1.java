/**
 * 
 */
package topic_wise.search;

import java.util.HashMap;

/**
 * @author Ashwin
 *
 */
public class map1
{
	public static void main(String[] args)
	{
		HashMap map1=new HashMap();
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map1.put("key3", "value3");
		System.out.println(map1);
		System.out.println(map1.containsKey("key1"));
		System.out.println(map1.containsValue("value3"));
	}
}
