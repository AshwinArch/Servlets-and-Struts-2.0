package passbyvalue;

public class Manager2 {
public static void main(String[] args) {
	int all[]={10,20,30};
	test1(all);
	System.out.println(all[0]);
	System.out.println(all[2]);
}
static void test1(int all[])
{
	all[0]=100;
	all[2]=200;
}
}
