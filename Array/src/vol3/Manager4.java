package vol3;

import java.util.Arrays;

//deepEquals(Object[]a1,Object[]a2)
//returns true if the two specified arrays are deeply equal to one another....
public class Manager4
{
	public static void main(String[] args)
	{
		Integer test1[] =
		{ 1, 2, 3 };
		Integer test2[] =
		{ 1, 2, 3 };
		Integer test3[] =
		{ 1, 2, 3, 4, 5 };
		Integer test4[] =
		{ 1, 2, 3, 4 };
		boolean equality = Arrays.deepEquals(test1, test2);
		System.out.println(equality);
		boolean equality1 = Arrays.deepEquals(test3, test4);
		System.out.println(equality1);
	}
}
// deepEquals method it can be checking arrays data..........
//