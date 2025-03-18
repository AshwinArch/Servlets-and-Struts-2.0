package class2;

public class A05
{
	public static void main(String[] args)
	{
		int all[]={10, 12, 15, 20};
		System.out.println(all[0]);
		test(all);
		System.out.println(all[0]);
		test(all[0]);
		System.out.println(all[0]);
	}
	static void test(int x[])
	{
		x[0]=100;
	}
	static void test(int x)
	{
		x=1000;
	}
}
