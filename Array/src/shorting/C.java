package shorting;

import java.util.Arrays;

public class C {
public static void main(String[] args) {
	String all[]={"abc","xyz","pqr","lara","ijk","123"};
	System.out.println(Arrays.toString(all));//[abc, xyz, pqr, lara, ijk]
	Arrays.sort(all);
	System.out.println(Arrays.toString(all));//[abc, ijk, lara, pqr, xyz]
}
}
