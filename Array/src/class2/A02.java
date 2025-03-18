package class2;

import java.util.Arrays;

public class A02
{
	public static void main(String[] args)
	{
		System.out.println("I am in the main");
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		System.out.println("-------------------");
		
	}
	static
	{
		A02.main(new String[]{});
	}
}
