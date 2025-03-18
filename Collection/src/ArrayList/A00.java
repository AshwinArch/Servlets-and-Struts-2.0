package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
/*for sorting through collection.sort cmd. we need same datatype data.
 * null time   :-      nullpointer exception
 * different datatype :  -     classcastexception
 * */
public class A00
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(90);
		a.add(90.06);
		a.add(90);
		a.add("abc");
		a.add(null);
		a.add(true);
		System.out.println(a.get(0));
		System.out.println(a);
			for(Object obj:a)
			{
				System.out.println(obj);
			}
	//Collections.sort(a);
		System.out.println(a);
	}
}
