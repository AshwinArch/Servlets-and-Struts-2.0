package class2;

import java.io.StreamCorruptedException;

public class A01
{
	static 
	{
		main(new String[]{"abc" , "xyz"});
	}
	public static void main(String[] args)
	{
		System.out.println("I am in the Main");
		for(String s:args)
		{
			System.out.println(s);
		}
		System.out.println("-----------");
	}
}
