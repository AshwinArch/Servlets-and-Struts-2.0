package passbyvalue;

public class Manager3 {
public static void main(String[] args) {
	String all[]={"abc","xyz","test"};
	test1(all);
	System.out.println(all[0]);
}
static void test1(String y[])
{
	y[0]="changed";
}
}
