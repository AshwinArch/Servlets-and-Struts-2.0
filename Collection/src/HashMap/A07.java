package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class A07
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("abc1", "value1");
		map.put("abc2", "value2");
		map.put("abc3", "value3");
		map.put("abc4", "value4");
		
		Set entries =map.entrySet();
		Iterator it=entries.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-----------------------------");
		}
	}
}
