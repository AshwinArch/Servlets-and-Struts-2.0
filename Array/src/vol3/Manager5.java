package vol3;

import java.util.Arrays;

//deepHashCode(Object[] a)
//returns a hash code based on the "deep contents"of the specified array....
public class Manager5 {
	public static void main(String[] args) {
		Integer test[] = { 1, 2, 3 };
		Integer test1[] = { 1, 2, 3 };
		int hashcode = Arrays.deepHashCode(test);
		int hashcode1 = Arrays.deepHashCode(test1);
		System.out.println(hashcode);
		System.out.println(hashcode == hashcode1);
	}
}
