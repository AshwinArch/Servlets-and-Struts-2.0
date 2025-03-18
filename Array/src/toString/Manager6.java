package toString;

import java.util.Arrays;

public class Manager6 {
	public static void main(String[] args) {
		int all[] = { 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(all));
		int index = Arrays.binarySearch(all, 5);
		System.out.println(index);
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
		index = Arrays.binarySearch(all, 9);
		System.out.println(index);
	}
}
// array index will be starting zero.......