package class2;

import java.util.Arrays;

public class A06
{
	public static void main(String[] args)
	{
		int x[]={12, 3, 56, 5, 11, 20, 15};
		char y[]={'a', 'q', 'x', 'h', 'h' ,'H', 'Z', 'z'};
		String z[]={"abc", "xyz", "123", "PQR", "ABC"};
		Double a[]={78.65, 123.0, 78.09,34.56 };
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		System.out.println(Arrays.toString(y));
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		
		System.out.println(Arrays.toString(z));
		Arrays.sort(z);
		System.out.println(Arrays.toString(z));
	}
}
