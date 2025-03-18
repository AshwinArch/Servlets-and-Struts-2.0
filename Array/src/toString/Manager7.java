package toString;

import java.util.Arrays;

public class Manager7 {
	public static void main(String[] args) {
		String s1[] = { "abc", null, "xyz" };
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
	}
}
/*
 arrays will be null can be sorting we will get NPE...
 */