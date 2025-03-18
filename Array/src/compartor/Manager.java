package compartor;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	int age;
	double weight;

	Person(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}

	public String toString() {
		return age + ":" + weight;
	}
}

class SortAge implements Comparator {
	public int compare(Object o1, Object o2) {
		return ((Person) o1).age - ((Person) o2).age;
	}
}

class SortWeight implements Comparator {
	public int compare(Object o1, Object o2) {
		return (int) (((Person) o1).weight - ((Person) o2).weight);
	}
}

public class Manager {
	public static void main(String[] args) {
		Person p1 = new Person(20, 59.08);
		Person p2 = new Person(36, 55.08);
		Person p3 = new Person(19, 53.08);
		Person p4 = new Person(21, 73.08);
		Person all[] = { p1, p2, p3, p4 };
		System.out.println("Arrays sort based on age");
		Arrays.sort(all, new SortAge());
		System.out.println(Arrays.toString(all));
		System.out.println("arrays sort based on weight");
		Arrays.sort(all, new SortWeight());
		System.out.println(Arrays.toString(all));

	}
}
// comparator it can be sorting attribute wise...
// comparator interface is a type of generic..
// array will be give ultimate performance...
// arrays will not be allowed different data type......
// arrays can be allow only integer data type...
// arrays only for one data type,it can't be stored more than one data type in
// arrays.......
// array size is immutable...
// we can store more than one data type then go for collections..
// arrays only for one data type.......
/*Arrays sort based on age
[19:53.08, 20:59.08, 21:73.08, 36:55.08]
arrays sort based on weight
[19:53.08, 36:55.08, 20:59.08, 21:73.08]
*/