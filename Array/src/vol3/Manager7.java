package vol3;

import java.util.Arrays;

//fill(int[]a,int val)
public class Manager7
{
public static void main(String[] args)
{
	int m[]=new int[5];
	m[0]=50;
	m[1]=23;
	m[2]=33;
	m[3]=44;
	m[4]=22;
	System.out.println("Before fill method");
	System.out.println(Arrays.toString(m));
	Arrays.fill(m,22);
	System.out.println("After fill method");
	System.out.println(Arrays.toString(m));
	//fill(int[]a,int from index,int to index,int val)
	Arrays.fill(m,1,3,33);
	System.out.println(Arrays.toString(m));
}
}
/*Before fill method
[50, 23, 33, 44, 22]
After fill method
[22, 22, 22, 22, 22]
[22, 33, 33, 22, 22]
*/