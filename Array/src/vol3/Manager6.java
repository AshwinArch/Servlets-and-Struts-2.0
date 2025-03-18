package vol3;

import java.util.Arrays;

//equals(int[]a,int[]a2);returns true if the specified arrays of ints are equal to one anather...
public class Manager6
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
	{ 1, 2, 3, 4,5 };
	boolean equal = Arrays.deepEquals(test1, test2);
	System.out.println(equal);//t
	boolean equal1 = Arrays.deepEquals(test3, test4);
	System.out.println(equal1);//t
}
}
