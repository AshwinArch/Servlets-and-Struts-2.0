package toString;

import java.util.Arrays;
import java.util.Collections;

public class Manager4 {
	public static void main(String[] args) {
		Integer all[] = { 10, 12, 0, 1, 11, 5, 15 };
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
		Arrays.sort(all,Collections.reverseOrder());
		System.out.println(Arrays.toString(all));
	}
}
//in arrays reverse method is there collections.reverseorder();
//sort method can be only for derived data type
/*
[10, 12, 0, 1, 11, 5, 15]
[0, 1, 5, 10, 11, 12, 15]
[15, 12, 11, 10, 5, 1, 0]
*/