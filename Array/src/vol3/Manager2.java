package vol3;

import java.util.Arrays;

//sort(int[]a,int from index,int to index)
public class Manager2 {
	public static void main(String[] args) {
		int m[] = new int[5];
		m[0] = 12;
		m[1] = 33;
		m[2] = 11;
		m[3] = 10;
		m[4] = 2;
		System.out.println("before sorting");
		for (int i : m) {
			System.out.println(i);
		}
		System.out.println("After sorting");
		Arrays.sort(m);
		for (int i : m) {
			System.out.println(i);
		}
	}
}
