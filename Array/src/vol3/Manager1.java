package vol3;

import java.util.Arrays;

public class Manager1
{
	public static void main(String[] args)
	{
		int m1[] = new int[11];
		m1[0] = 50;
		m1[1] = 35;
		m1[2] = 33;
		m1[3] = 44;
		m1[4] = 23;
		m1[5] = 56;
		System.out.println("before sorting");
		for (int i : m1)//enhanced for loop it can iterate all elements...
		{
			System.out.println(i);
		}
		// System.out.println(m1);
		Arrays.sort(m1);
		System.out.println("after sorting");
		for (int i : m1)
		{
			System.out.println(i);
		}
		// System.out.println(m1);
	}
}
//sort(int[]a)
