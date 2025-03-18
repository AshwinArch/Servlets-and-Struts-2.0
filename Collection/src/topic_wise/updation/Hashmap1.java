/**
 * 
 */
package topic_wise.updation;

import java.util.HashMap;

/**
 * @author Ashwin
 *
 */
public class Hashmap1
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		System.out.println(map);
		map.put("key2", "new value2");
		System.out.println(map);
	}
}
