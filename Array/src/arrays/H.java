package arrays;

public class H
{
	public static void main(String[] args)
	{
		Object obj = new Object();
		int all[] = new int[10];
		all[0] = 1;
		all[1] = 2;
		all[2] = 3;
		all[3] = 4;
		all[4] = 5;
		all[5] = 0;
		for(int i : all)
		{
			System.out.println(i);
		}
	}
}
//object canot be cast int...we will get CCE