package vol3;

import java.util.Arrays;

//binary search(int[]a,int key)
public class Manager3 {
	public static void main(String[] args) {
		int m[] = new int[5];
		m[0] = 12;
		m[1] = 44;
		m[2] = 22;
		m[3] = 33;
		m[4] = 11;
		Arrays.sort(m);
		int index = Arrays.binarySearch(m, 10);
		int index1 = Arrays.binarySearch(m, 11);
		System.out.println("index of 10 is:" + index);
		System.out.println("index of 11 is:" + index1);
	}
}
// the array must be sorted binary search will be give index
