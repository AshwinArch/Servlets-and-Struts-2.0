package vol3;

import java.util.Arrays;
import java.util.Comparator;

class Reverse implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2-i1;
	}
}
public class Manager8
{
public static void main(String[] args)
{
	
	Integer test1[]={1,2,3};
	System.out.println("Before reverse order");
	System.out.println(Arrays.toString(test1));
	Arrays.sort(test1,new Reverse());
	System.out.println("After Reverse order");
	System.out.println(Arrays.toString(test1));
}
}
/*Before reverse order
[1, 2, 3]
After Reverse order
[3, 2, 1]
*/