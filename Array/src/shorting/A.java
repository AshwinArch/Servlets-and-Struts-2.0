package shorting;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		float mar[] = { 100, 1, 0, 10, 26, 15 };
		System.out.println(Arrays.toString(mar));
		Arrays.sort(mar);
		System.out.println(Arrays.toString(mar));
	}
}
/*
[100.0, 1.0, 0.0, 10.0, 26.0, 15.0]
[0.0, 1.0, 10.0, 15.0, 26.0, 100.0]
*/