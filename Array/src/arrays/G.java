package arrays;

public class G {
public static void main(String[] args) {
	double d1[]=new double[3];
	double d2[]=new double[30];
	System.out.println(d1);
	System.out.println(d2);
	d1[0]=10;
	d1[1]=20;
	d2=d1;
	System.out.println(d1);
	System.out.println(d2[0]);
}
}
/*
[D@1888759
[D@6e1408
[D@6e1408
[D@6e1408
*/