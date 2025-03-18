package toString;

import java.util.Arrays;

public class Manager3 {
	public static void main(String[] args) {
		int all[]={1,9,8,7,6,5,4,3,2,10};
		System.out.println(Arrays.toString(all));
		Arrays.sort(all,3,6);//sort(int[]a,int from index,int to index);
		System.out.println(Arrays.toString(all));
	}
}
/*
sort(int[]a,int from index,int to index);
[1, 9, 8, 7, 6, 5, 4, 3, 2, 10]
[1, 9, 8, 5, 6, 7, 4, 3, 2, 10]
*/