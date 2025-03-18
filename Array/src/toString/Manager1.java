package toString;

import java.util.Arrays;

interface A
{
	interface B
	{
		int i=90;//inside a interface all members are public static final...-
		void test();	
	}
}
public class Manager1 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 10, 20, 30 };
		System.out.println(Arrays.equals(a, b));
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(Arrays.hashCode(a));
		System.out.println(Arrays.hashCode(b));
		System.out.println(a==b);

	}
}
/*
true
false
false
40051
40051
false*/