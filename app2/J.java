class J
{
	void test(int a, int b)
	{
	double add = a + b;
	System.out.println("Total is " + add);
	}
}
class Manager
{
	public static void main(String arg[])
	{
		J a=new J();
		a.test(10,10);
	}
}