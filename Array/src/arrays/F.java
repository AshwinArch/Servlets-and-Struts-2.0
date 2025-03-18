     package arrays;

public class F {
public static void main(String[] args) {
	double d[]=new double[10];
	int i=10;
	float f=20;
	d[0]=i;
	d[1]=f;
	System.out.println(d[0]);//10.0
	System.out.println(d[1]);//20.0
	System.out.println(d[2]);//0.0
	System.out.println(d[9]);//0.0
}
}
