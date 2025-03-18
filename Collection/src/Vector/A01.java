/**
 * 
 */
package Vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Ashwin
 *                     ENUMERATION
 *we can able to read only once and too in only forward direction....................
 */
public class A01
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(90);
		v.add(0);
		v.add(10);
		v.add(1);
		v.add(9);
		Enumeration enum1=v.elements();
		while(enum1.hasMoreElements())                  ///it will work as hasnext().....
		{
			System.out.println(enum1.nextElement());                   //it will work as next()
		}
		System.out.println(v);
	}
}
