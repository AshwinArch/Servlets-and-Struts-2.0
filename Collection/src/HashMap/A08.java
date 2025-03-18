/**
 * 
 */
package HashMap;

import java.util.HashMap;

/**
 * @author Ashwin
 *           In HashMap adding element..........
 */
public class A08
{
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");                             //1st method.........
		map.put("key4", "value4");
		
		HashMap map1=new HashMap();
		map1.put("key5", "value5");          
		map1.putAll(map);                                                 //2nd method........
		
		HashMap map2=new HashMap(map1);                    //3rd method.........
		map2.put("key6", "value6");

		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
		
	}
}
