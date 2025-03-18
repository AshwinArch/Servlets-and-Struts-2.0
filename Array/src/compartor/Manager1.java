package compartor;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class A implements Comparable<A> {
	int i;

	A(int i) {
		this.i = i;
	}

	public String toString() {
		return "i=" + i;
	}

	public int compareTo(A a) {
		return this.i - a.i;
	}

}

class B {
	int i;
	int j;

	B(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "i=" + i + ":j=" + j;
	}
}

class SortBasedOnI implements Comparator<B> {
	public int compare(B b1, B b2) {
		return b1.i - b2.i;
	}
}

class SortBasedOnJ implements Comparator<B> {
	public int compare(B b1, B b2) {
		return b1.j - b2.j;
	}
}

public class Manager1 {
	public static void main(String[] args) {
		A a1 = new A(22);
		A a2 = new A(55);
		A a3 = new A(20);
		A a4 = new A(25);
		A all[] = { a1, a2, a3, a4 };
		System.out.println(Arrays.toString(all));
		Arrays.sort(all);
		System.out.println(Arrays.toString(all) );
		System.out.println("============");
		B b1 = new B(1, 2);
		B b2 = new B(2, 1);
		B b3 = new B(20, 0);
		B b4 = new B(25, 38);
		B elements[] = { b1, b2, b3, b4 };
		System.out.println(Arrays.toString(elements));
		System.out.println("based on j");
		Arrays.sort(elements, new SortBasedOnJ());
		System.out.println(Arrays.toString(elements));
		System.out.println("based on i");
		Arrays.sort(elements, new SortBasedOnI());
		System.out.println(Arrays.toString(elements));
	}
}
