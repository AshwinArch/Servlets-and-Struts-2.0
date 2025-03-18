package toString;

import java.util.Arrays;
import java.util.Collections;

public class Manager5 {
	public static void main(String[] args) {
		String all[] = { "abc", "xyz", "123", "ABC", "AAc", "Abc" };
		Arrays.sort(all);
		System.out.println(Arrays.toString(all));
		Arrays.sort(all, Collections.reverseOrder());
		System.out.println(Arrays.toString(all));
	}
}
// --->Arrays sorting method only for derived data type
// --->[123, AAc, ABC, Abc, abc, xyz]
// -->sorting can be first digits,second can be Upper case third Preference
// digits
// -->
/*
[123, AAc, ABC, Abc, abc, xyz]
[xyz, abc, Abc, ABC, AAc, 123]

 */