package arrays;

public class J {
	static void test(int all[]) {
		for (int i : all) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5 };
		test(x);
		for (int i : x) {
			System.out.println(i);
		}
		System.out.println("------------");
		test(new int[] { 10, 20, 30 });
	}
}
// static test method we can call directly.....
