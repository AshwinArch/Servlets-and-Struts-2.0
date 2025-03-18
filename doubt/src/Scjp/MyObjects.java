/**
 * 
 */
package Scjp;

import java.lang.reflect.*;
import java.util.*;

/**
 * @author Ashwin
 *
 */

public class MyObjects
{
	Object[] myObjects = { new Integer(12), new String("foo"), new Integer(5), new Boolean(true) }; 
			Arrays.sort(myObjects);
			for( int i=0; i<myObjects.length; i++) { 
			System.out.print(myObjects[i].toString()); 
			System.out.print(" "); 
			} 
}
}
