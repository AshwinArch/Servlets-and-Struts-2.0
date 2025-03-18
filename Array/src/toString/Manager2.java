package toString;

import java.util.Arrays;

public class Manager2 {
public static void main(String[] args) {
	int all[]={1,43,3,33,45,2,11,8,0};
	System.out.println("print before sorting");
	System.out.println(Arrays.toString(all));
	System.out.println("print ofter sorting");
	Arrays.sort(all);
	System.out.println(Arrays.toString(all));
}
}
/*
print before sorting
[1, 43, 3, 33, 45, 2, 11, 8, 0]
print after sorting
[0, 1, 2, 3, 8, 11, 33, 43, 45]

*/