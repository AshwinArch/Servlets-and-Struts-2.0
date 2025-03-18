package class1;

import java.lang.reflect.Array;
import java.util.Arrays;

/////Array development
public class A01
{
	public static void main(String[] args)
	{
		int []all=new int[6];
	//	System.out.println(all[2]);
	//	System.out.println(all[8]);
	//	System.out.println(all.length);
		System.out.println(all);
		System.out.println(Arrays.toString(all));
		for(int i : all)
		{
			System.out.println(i);
		}
		for(int i=0;i<all.length;i++)
		{
			System.out.print(all[i]);
		}
		System.out.println();
	//	all[0]=null;                                     ///CTE :-Type mismatch: cannot convert from null to int
	//	System.out.println(all[0]);                      
		int all1[]=null;
		all1=new int [10];
		System.out.println(Arrays.toString(all1));
		
		int all2[]={10,20,30};
		System.out.println(Arrays.toString(all2));
		
		int all3[]=new int[]{123,12,1};
		System.out.println(Arrays.toString(all3));
		System.out.println(all3[4]);
	}
}
