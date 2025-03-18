/**
 * 
 */
package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ashwin          ITERATOR
 *
 */
public class A09
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		System.out.println(map);
		System.out.println(map.get("key1"));
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		Object key,value;
		for(;it.hasNext();)
		{
			key=it.next();
			value=map.get(key);
			System.out.println(key+" : " +value);
		}
	}
}
