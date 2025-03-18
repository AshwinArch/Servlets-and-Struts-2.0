package class2;

import java.util.Arrays;

public class A14
{
	public static void main(String[] args)
	{
		A13 all[]= new A13[4];
		all[0]=new A13("kiran",25, 60.08);
		all[1]=new A13("Anup",15, 60.08);
		all[2]=new A13("preveen",35, 50.00);
		all[3]=new A13("Aditya",13, 67.08);
		System.out.println(Arrays.toString(all));
		Arrays.sort(all, new SortBasedOnAge());
		System.out.println(Arrays.toString(all));
		System.out.println("----------------------------------------------------------------------");
		System.out.println(Arrays.toString(all));
		Arrays.sort(all, new SortBasedOnName());
		System.out.println(Arrays.toString(all));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(Arrays.toString(all));
		Arrays.sort(all, new SortBasedOnWeight());
		System.out.println(Arrays.toString(all));
		
	}
}
